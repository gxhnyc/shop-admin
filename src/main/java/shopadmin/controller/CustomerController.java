package shopadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.entity.Customer;
import shopadmin.service.CustomerService;

@Controller
public class CustomerController {
	
	private CustomerService customerService;
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@RequestMapping(method=RequestMethod.GET,value="/customer-list")
	public String listAllCustomers(Model model) {
		
		List<Customer> customers=customerService.listAll();
		System.out.println(customers);
		model.addAttribute("customers",customers );
		
		return "customer-list";
		
	}
}
