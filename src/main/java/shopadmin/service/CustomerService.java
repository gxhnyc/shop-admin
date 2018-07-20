package shopadmin.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import shopadmin.entity.Customer;

@Transactional
public interface CustomerService {
	/**
	 * 列出所有顾客会员信息
	 * @return
	 */
	public List<Customer> listAll();
}
