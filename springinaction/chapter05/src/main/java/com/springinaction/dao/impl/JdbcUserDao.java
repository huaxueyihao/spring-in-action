package com.springinaction.dao.impl;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.springinaction.dao.UserDao;
import com.springinaction.model.User;

/**
 * 
 * @ClassName: JdbcUserDao 
 * @Description: UserDao的实现类
 * @author mao
 * @date 2017年3月29日 下午11:59:45 
 *
 */
public class JdbcUserDao implements UserDao{
	
	//过时了都，4.2.9版本都没有这个类，哎，这书太老了
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
