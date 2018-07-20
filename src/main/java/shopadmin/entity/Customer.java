package shopadmin.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Customer {
	  private Long c_id;//用户id
	  @Size(min=2,max=32)
      private String username;//用户名
	  @NotEmpty(message="必填")
      private String password;//密码
      private String lastdate;//最后一次登录时间
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastdate() {
		return lastdate;
	}
	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}
      
      
}
