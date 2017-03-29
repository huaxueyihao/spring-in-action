package com.springinaction.dao.impl;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.springinaction.dao.UserDao;
import com.springinaction.model.User;

/**
 * 
 * @ClassName: JdbcUserDao 
 * @Description: UserDao��ʵ����
 * @author mao
 * @date 2017��3��29�� ����11:59:45 
 *
 */
public class JdbcUserDao implements UserDao{
	
	//��ʱ�˶���4.2.9�汾��û������࣬��������̫����
	private SimpleJdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addUser(User user){
		
		jdbcTemplate.update("update user set username=? where id=?",
				user.getUserName(),
				user.getId()
				);
	}
}