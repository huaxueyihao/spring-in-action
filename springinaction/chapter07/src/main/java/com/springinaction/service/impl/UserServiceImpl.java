package com.springinaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springinaction.mapper.UserMapper;
import com.springinaction.model.User;
import com.springinaction.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> selectAllUser() {
		
		return userMapper.selectByExample(null);
	}

}
