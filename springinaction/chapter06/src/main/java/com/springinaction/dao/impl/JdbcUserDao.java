package com.springinaction.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.springinaction.dao.IUserDao;
import com.springinaction.model.User;

/**
 * 
 * @ClassName: JdbcUserDao 
 * @Description: UserDao��ʵ����
 * @author mao
 * @date 2017��3��29�� ����11:59:45 
 *
 */
public class JdbcUserDao implements IUserDao{
	
	//��ʱ�˶���4.2.9�汾��û������࣬��������̫����
	private SimpleJdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*public void addUser(User user){
		
		jdbcTemplate.update("update user set username=? where id=?",
				user.getUserName(),
				user.getId()
				);
	}*/

	public int addUser(User user) throws Exception {
		// TODO �Զ����ɵķ������
		return 0;
	}

	public int deleteOneUser(int id) throws Exception {
		// TODO �Զ����ɵķ������
		return 0;
	}

	public List<User> selectAllUsers() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}
}
