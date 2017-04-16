package com.springinaction.test;

import java.util.List;

import org.junit.Test;

import com.springinaction.controller.UserController;
import com.springinaction.model.User;

public class UserControllerTest {
	
	@Test
	public void selectAllUserTest(){
		
		UserController controller = new UserController();
		List<User> userList = controller.selectAllUser();
		System.out.println(userList);
		
	}
	
}
