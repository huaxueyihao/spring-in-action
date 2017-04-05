package com.springinaction.test;

import java.io.Reader;
import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springinaction.dao.IUserDao;
import com.springinaction.model.User;
import com.springinaction.service.IUserService;
import com.springinaction.service.impl.UserServiceImpl;



public class TestCase {
	
	//���ClassPathXmlApplicationContext��springframe-context��
	//org.springframework.context.support���µ���
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//ע��·��
	
	//��������Դ����
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
	
	//����spring����Դ����
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
	
	//����SimpleJdbcTemplate
	//����spring����Դ����
	@Test
	public void testTemplate() throws Exception {
		
		IUserDao userDao = (IUserDao)ac.getBean("jdbcUserDao");
		
		User user = new User();
		user.setId(1);
		user.setUserName("�����û�");
		userDao.addUser(user);
		
		
	}
	
	
	@Test
	public void testTx() throws Exception {
		
		IUserService userService = (IUserService) ac.getBean("userService");

		//����һ��idΪ4���û���ɾ��id22���û�����;�׳��쳣������ֻع���������ɾ��id22���û�
		userService.addUser(new User(6, "����6", "2001-01-01", "1","����"), 1);
		
		
	}
	
	
	
}