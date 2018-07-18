package shopadmin.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import shopadmin.entity.Limits;
import shopadmin.entity.Operator;

/**
 * 继承springsecurity提供的User类获得了UserDetails的基本实现，
 * 如username、password、authorities、enabled等字段及其getter；
 * 还有继承的equals和hashCode会根据username判断两个UserDetailsImpl是否相等，
 * 用于SessionRegistry中维护同一个用户名多次登录导致多个会话的情况
 */
public class UserDetailsImpl extends User{
	
	

	private static final long serialVersionUID = 1L;
	
	private Operator operator;
	public Operator getOperator() {
	        return operator;
	    }
	/**
	 * 构造方法
	 * @param operator
	 */
	public UserDetailsImpl(Operator operator) {
		super(operator.getUsername(),
				operator.getPassword(),
				operator.getDisabled() == null ? true : !operator.getDisabled(), 
						true, true, true, buildAuthorities(operator));
		this.operator=operator;
	}

	/*
	private String username;
	private String password;
	private List<GrantedAuthority> authorities;//权限
	private boolean enabled;
	private Operator operator;*/
	
	
	
	
	
	/**
	 * 	e.g.
     *	ROLE_图书管理员
     *	PERM_BOOK_RO
     *	PERM_AUTHOR_RO
     *	PERM_PUBLISHER_RO
     *	将权限按以上格式设置到authorities属性中去
	 * @param operator
	 * @return
	 */
	private static List<GrantedAuthority> buildAuthorities(Operator operator) {

		List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + operator.getRole().getRole_name()));
		
		for(Limits li:operator.getRole().getLimits()) {
			authorities.add(new SimpleGrantedAuthority("Limi_"+li.getLimits_id()));
		}
		
		return authorities;
	}
	
}
