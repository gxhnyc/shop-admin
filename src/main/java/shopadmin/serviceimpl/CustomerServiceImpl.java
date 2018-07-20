package shopadmin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.entity.Customer;
import shopadmin.mapper.CustomerMapper;
import shopadmin.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerMapper customerMapper;
	
	@Autowired
	public CustomerServiceImpl(CustomerMapper customerMapper) {
		super();
		this.customerMapper = customerMapper;
	}


	@Override
	public List<Customer> listAll() {
		// TODO Auto-generated method stub
		return customerMapper.listAll();
	}

}
