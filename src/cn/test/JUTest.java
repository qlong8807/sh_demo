package cn.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import cn.demo.user.controller.UserController;
import cn.demo.user.service.UserService;

public class JUTest {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ApplicationContext acx;
	private UserService us;
	private UserController uc;
	
	@Before
	public void setUp(){
		acx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		us = (UserService) acx.getBean("userServiceImpl");
		us = (UserService) acx.getBean("usi");
		uc = acx.getBean(UserController.class);
		
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		
	}
	
	@Test
	public void testName() {
		String name = us.getUserName();
		System.out.println(name);
	}
	
	@Test
	public void add(){
		System.out.println(us.add(3, 8));
	}
	/*@Test
	 public void testListJson() {
	  logger.info("*****testListJson start**********");
	  MockHttpServletResponse response = new MockHttpServletResponse();
	  MockHttpServletRequest request = new MockHttpServletRequest("POST", "");
	  request.setRequestURI("/case/listJson");
	  request.addParameter("name", "name");
	  List<String> result = controller.listJson(request, response);
	  logger.info("*****result:" + result);
	  Assert.assertTrue("result is empty", !result.isEmpty());

	  logger.info("*****testListJson end**********");
	 }*/


}
