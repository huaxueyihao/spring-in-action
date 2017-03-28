package com.springinaction.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springinaction.springidol.Auditorium;
import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.Magician;
import com.springinaction.springidol.MindReader;
import com.springinaction.springidol.OneManBand;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.PoeticJuggler;
import com.springinaction.springidol.Stage;
import com.springinaction.springidol.Thinker;
import com.springinaction.springidol.Ticket;
import com.springinaction.springidol.Volunteer;


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
	
}
