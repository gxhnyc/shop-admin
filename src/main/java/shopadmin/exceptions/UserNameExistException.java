package shopadmin.exceptions;

public class UserNameExistException extends ServiceException {

	public UserNameExistException() {
		super("该operator姓名已存在！");
		
	}

}
