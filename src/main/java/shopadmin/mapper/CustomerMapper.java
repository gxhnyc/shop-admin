package shopadmin.mapper;

import java.util.List;

import shopadmin.entity.Customer;

public interface CustomerMapper {
	/**
	 * 列出所有顾客会员信息
	 * @return
	 */
	public List<Customer> listAll();
}
