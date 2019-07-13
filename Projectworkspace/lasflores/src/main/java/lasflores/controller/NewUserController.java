package lasflores.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lasflores.model.NewUserReg;
import lasflores.service.NewUserRegService;



@Controller
@RequestMapping("/userReg")
public class NewUserController 

{ 

	@Autowired
	private NewUserRegService NewUserRegService;                                                                    
	                        
	@GetMapping("/showForm")
	public String showFormForAdd(ModelMap theModel) {
		NewUserReg theNewUserReg=new NewUserReg();
		//addAttribute will include all the property of NewUserReg
		theModel.addAttribute("userReg", theNewUserReg);
		return "NewUserReg-form";
	}
	
	//When we click save button saveNewUserReg method will be called 
	@PostMapping("/saveNewUserReg")
	public String saveNewUserReg(@ModelAttribute("userReg") NewUserReg theNewUserReg)
	{ NewUserRegService.saveNewUserReg(theNewUserReg);
	return "redirect:/userReg/list";
	}
	
	@GetMapping("/list")
	  public String listNewUserRegs(ModelMap theModel)
	  {
		List<NewUserReg>theNewUserRegs=NewUserRegService.getNewUserReg();
		theModel.addAttribute("userRegs",theNewUserRegs);
		return "list-NewUserReg";
	  }
}
