package cn.demo.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

//	private finalClinic clinic;

	/*@Autowired
	publicClinicController(Clinic clinic) {
		this.clinic = clinic;
	}*/

//	@RequestMapping("/login")
	public String login(String name,String password,ModelMap map,HttpServletRequest request){
		System.out.println(name+"==="+password);
		map.addAttribute("name", name);
		map.addAttribute("password", password);
		return "cn/demo/user/user_list";
	}
	@RequestMapping("/a")
	public void welcomeHandler() {
	}

	@RequestMapping("/b")
	public ModelMap vetsHandler() {
		return new ModelMap("");
	}
	
	@RequestMapping("/c")
	@ResponseBody
	public String getString(){
		return "c";
	}
}