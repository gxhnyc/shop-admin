package shopadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import shopadmin.entity.Operator;
import shopadmin.mapper.OperatorMapper;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	private OperatorMapper operatorMapper;
	@Autowired
	public UserDetailsServiceImpl(OperatorMapper operatorMapper) {
		super();
		this.operatorMapper = operatorMapper;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Operator operator = operatorMapper.findOneByUsername(username);
	        System.out.println("userDetailsServiceImpl.loadUserByUserName()："+operator.getEmail());
	        if (operator == null) { // 按照接口要求，用户名不存在时必须抛异常UsernameNotFoundException
	            throw new UsernameNotFoundException("用户名不存在: " + username);
	        } 
	        
	        // 从mapper得到的是实体operator，需要转换成springsecurity所需的UserDetails对象
	        return new UserDetailsImpl(operator);
	}

}
