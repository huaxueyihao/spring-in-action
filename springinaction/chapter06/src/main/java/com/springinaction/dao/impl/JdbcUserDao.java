package com.springinaction.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.springinaction.dao.IUserDao;
import com.springinaction.model.User;

/**
 * 
 * @ClassName: JdbcUserDao 
 * @Description: UserDao的实现类
 * @author mao
 * @date 2017年3月29日 下午11:59:45 
 *
 */
public class JdbcUserDao implements IUserDao{
	
	//过时了都，4.2.9版本都没有这个类，哎，这书太老了
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
		// TODO 自动生成的方法存根
		return 0;
	}

	public int deleteOneUser(int id) throws Exception {
		// TODO 自动生成的方法存根
		return 0;
	}

	public List<User> selectAllUsers() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}
}
