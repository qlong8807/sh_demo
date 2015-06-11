package cn.demo.user.model;

import java.util.ArrayList;
import java.util.List;

public class Dept {
	private int id;
	private String name;
	private List<User> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		if(null != users){
			return users;
		}else {
			return new ArrayList<User>();
		}
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
	
}
