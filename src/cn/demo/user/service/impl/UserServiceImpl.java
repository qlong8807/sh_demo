package cn.demo.user.service.impl;

import org.springframework.stereotype.Service;

import cn.demo.user.service.UserService;

@Service("usi")
public class UserServiceImpl implements UserService{

	public String getUserName() {
		return "zhang";
	}

	public int add(int a, int b) {
		return a + b;
	}

}
