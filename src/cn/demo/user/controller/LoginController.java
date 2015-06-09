package cn.demo.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.demo.user.model.User;

public class LoginController extends MultiActionController{

	/*public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("===");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name+"==="+password);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cn/demo/user/user_list");
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		return mav;
	}*/
	
	public String hello(HttpServletRequest request,
			HttpServletResponse response,User u){
		System.out.println("======");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + "  "+password);
		return "cn/demo/user/user_list";
	}

}
