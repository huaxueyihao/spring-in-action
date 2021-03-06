package com.springinaction.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springinaction.dao.IUserDao;
import com.springinaction.model.User;
import com.springinaction.service.IUserService;

@Component("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier("userDao")
	private IUserDao userDao;
	
	
	
	
	@Transactional(propagation=Propagation.REQUIRED)//这里是注解
	public int addUser(User user,int id) throws Exception {
		
		userDao.deleteOneUser(id);
		
		//这里是测试会不会回滚的
//		int i = 1/0;
		
		userDao.addUser(user);
		
		return 0;
	}

	public int deleteOneUser(int id) throws Exception {
		
		return userDao.deleteOneUser(id);
	}

	public List<User> selectAllUsers() throws Exception {
		
		return userDao.selectAllUsers();
	}

}
