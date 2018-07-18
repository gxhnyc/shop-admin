package shopadmin.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shopadmin.entity.Cellphone;
import shopadmin.entity.CellphoneForm;
import shopadmin.exceptions.UserNameExistException;
import shopadmin.service.CellphoneService;




@Controller
public class CellphoneController {
	
	private CellphoneService cellphoneService;
	
	
	@Autowired
	public CellphoneController(CellphoneService cellphoneService) {
		super();
		this.cellphoneService=cellphoneService;
	}





//-------------------------------------cellphone-add-start--------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/cellphone-edit")
	public String add(@ModelAttribute Cellphone cellphone,Model model) {
		System.out.println("CellphoneCtroller.addCellphone(get)----------");
		System.out.println("Cellphone:"+cellphone.getCp_model());
		 prepareOptionsInAdd(model);		 
		return "cellphone-edit";		
	}	

	@RequestMapping(method=RequestMethod.POST,value="/cellphones/cellphone-edit")
	public String addCellphone(@ModelAttribute @Valid Cellphone cellphone,BindingResult bindingResult,Model model) {
				
		if(bindingResult.hasErrors()) {
			 prepareOptionsInAdd(model);
			 return "cellphone-edit";
		}
		
		try {
			cellphoneService.createOne(cellphone);
		}catch(UserNameExistException ue) {
			System.out.println(ue.getMessage());
			//手动添加错误
			bindingResult.rejectValue("cp_model", "form.addCellphone.modelnameExist", "该款手机型号已存在！");
			prepareOptionsInAdd(model);
			return "cellphone-edit";
		}
		
		return "redirect:/cellphones/";		
	}
//-------------------------------------cellphone-add-end--------------------------------------
	
	//-------------------------------------cellphone-修改-start--------------------------------------
		@RequestMapping(method=RequestMethod.GET,value="/cellphones/cellphone-edit/{id}")
		public String update(@ModelAttribute Cellphone cellphone,Model model,@PathVariable String id) {
			System.out.println("CellphoneCtroller.修改Cellphone(get)----------"+id);
			
			Cellphone cell=cellphoneService.findByID(id);
			model.addAttribute("cellphone", cell);
			 		 
			return "cellphone-edit";		
		}
		@RequestMapping(method=RequestMethod.POST,value="/cellphones/cellphone-edit/{cp_id}")
		public String update(@ModelAttribute @Valid Cellphone cellphone,BindingResult bindingResult,Model model) {
					
			if(bindingResult.hasErrors()) {
				 prepareOptionsInAdd(model);
				 return "cellphone-edit";
			}			
			try {
				cellphoneService.updateOne(cellphone);
			}catch(UserNameExistException ue) {
				System.out.println(ue.getMessage());
				//手动添加错误
				bindingResult.rejectValue("cp_model", "form.addCellphone.modelnameExist", "该款手机型号已存在！");
				prepareOptionsInAdd(model);
				return "cellphone-edit";
			}
			
			return "redirect:/cellphones/";		
		}	
//------------------------------------------删除------------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/cellphone-delete/{id}")
	public String delete(@PathVariable String id) {
		
		cellphoneService.deleteOne(id);
		
		return "redirect:/cellphones/";	
		
	}
	
	
//-------------------------------------cellphone-list--------------------------------------
	/**
	 * list只有get请求，没有post请求
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/")
	public String list(Model model) {
		List<Cellphone> cellphones=cellphoneService.findAll();
		model.addAttribute("cellphones", cellphones);		
		return "cellphone-list";		
	}
//-------------------------------------cellphone-details--------------------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/cellphone-details/{id}")
	public String details(@PathVariable String id,Model model) {
		Cellphone cellphone=cellphoneService.findByID(id);
		model.addAttribute("cellphone", cellphone);
		
		return "cellphone-details";
		
	}
	
//-------------------------------------cellphone-list-end--------------------------------------
	
	//------------------------------------模糊查询-------------------------
	@RequestMapping(method=RequestMethod.GET,value="/cellphones/cellphone-select")
	public String selectget(@ModelAttribute Cellphone cellphone,Model model) {
		model.addAttribute("cellphone", cellphone);
		
		return "cellphone-select";
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/cellphones/cellphone-select")
	public String select(@ModelAttribute CellphoneForm cellphoneForm,Model model) {
		
		List<Cellphone> cellphones=cellphoneService.fuzzyQuery(cellphoneForm);
		
		/*if(cellphone.getCp_id()!=null||!cellphone.getCp_id().equals("")) {
			Cellphone cell=cellphoneService.findByID(cellphone.getCp_id());
			System.out.println(cell.toString());
			model.addAttribute("cellphone", cell);
			return "cellphone-showselect";
		}*/
		
		return "cellphone-select";
		
	}
	
	/**
	 * 执行cellphone-add
	 * @param model
	 */
	private void prepareOptionsInAdd(Model model) {
		
		System.out.println("忆准备好！");	
	}
	
}
