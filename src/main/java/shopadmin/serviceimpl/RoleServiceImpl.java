package shopadmin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import shopadmin.entity.Limits;
import shopadmin.entity.Role;
import shopadmin.exceptions.RoleNameExistException;
import shopadmin.mapper.RoleMapper;
import shopadmin.service.RoleService;

@Service
@Transactional//开启事务应用服务
public class RoleServiceImpl implements RoleService {
	
	private RoleMapper roleMapper;
	private SessionRegistry sessionRegistry;
    
    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper,
                           SessionRegistry sessionRegistry) {
        this.roleMapper = roleMapper;
        this.sessionRegistry = sessionRegistry;
    }


	@Override
	public List<Role> findAllOptions() {
		
		return roleMapper.findAllOptions();
	}


	@Override
	public Role findOne(Long id) {
		// TODO Auto-generated method stub
		return roleMapper.findOne(id);
	}


	@Override
	public void create(Role role) {
		//去数据库查询角色名称，若有则返回一个大于0的整数，抛异常
		if(roleMapper.roleNameExist(role.getRole_name())>0) {
			throw new RoleNameExistException();
		}
		//创建角色
		roleMapper.create(role);
		//创建角色-权限关联
		for(Limits limit:role.getLimits()) {
			roleMapper.addLimits(role.getRole_id(),limit.getLimits_id()	);
		}
		
		
	}


	@Override
	public void deleteOne(Long id) {
		roleMapper.deleteLimits(id);
		roleMapper.deleteRole(id);
		
	}


	@Override
	public Role findOneToEdit(Long id) {
		
		//然后返回查询到的角色id,角色名，角色描述
		return roleMapper.findOneToEdit(id);
	}


	@Override
	public void update(Role role) {
		//编辑提交时，先删除关联limits关系
		roleMapper.deleteLimits(role.getRole_id());
		roleMapper.update(role);
		//建立关联
		for(Limits li:role.getLimits()) {
			roleMapper.addLimits(role.getRole_id(),li.getLimits_id());
		}
		  // 将该角色的所有已登录用户退出
        logoutOperatorsOfRole(role);
	}


	private void logoutOperatorsOfRole(Role role) {
		List<Object> allLoginedPrincipals = sessionRegistry.getAllPrincipals();
        for (Object principal : allLoginedPrincipals) { // 遍历每一个已登录用户
            UserDetailsImpl userDetails = (UserDetailsImpl) principal;
            if (userDetails.getOperator().getRole().getRole_id() == role.getRole_id()) { // 该用户的角色已经被修改（权限可能被修改）
                List<SessionInformation> sessions = sessionRegistry.getAllSessions(principal, false);
                // 保守起见，将该用户的所有登录退出
                for (SessionInformation session : sessions) {
                    session.expireNow(); // 使会话失效
                }
            }
        }
		
	}
	

}
