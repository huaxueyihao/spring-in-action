package com.springinaction.test;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springinaction.dao.UserDao;
import com.springinaction.model.User;



public class TestCase {
	
	//这个ClassPathXmlApplicationContext是springframe-context中
	//org.springframework.context.support包下的类
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//注意路径
	
	//测试数据源配置
	@Test
	public void testData() throws Exception {
		
		BasicDataSource dataSource = (BasicDataSource)ac.getBean("dataSource");
		
		Connection connection = dataSource.getConnection();
	
		Statement createStatement = connection.createStatement();
		
		ResultSet rs = createStatement.executeQuery("select * from  user");
		
		while(rs.next()){
			System.out.println(rs.getString("username"));
		}
		
	}
	
	//测试spring数据源配置
	@Test
	public void testSpringData() throws Exception {
		
		DriverManagerDataSource dataSource = (DriverManagerDataSource)ac.getBean("dataSource");
		
		Connection connection = dataSource.getConnection();
	
		Statement createStatement = connection.createStatement();
		
		ResultSet rs = createStatement.executeQuery("select * from  user");
		
		while(rs.next()){
			System.out.println(rs.getString("username"));
		}
		
	}
	
	//测试SimpleJdbcTemplate
	//测试spring数据源配置
	@Test
	public void testTemplate() throws Exception {
		
		UserDao userDao = (UserDao)ac.getBean("jdbcUserDao");
		
		User user = new User();
		user.setId(1);
		user.setUserName("测试用户");
		userDao.addUser(user);
		
		
	}
	
}
