package com.springinaction.service;

import java.util.List;

import com.springinaction.model.User;

public interface IUserService {
	
	/**
	 * 
	* @Title: addUser 
	* @Description:  先珊瑚一个用户，再增加一个用户
	* @param @param user
	* @param @param id
	* @param @return
	* @param @throws Exception    
	* @return int    
	* @throws
	 */
	public int addUser(User user,int id) throws Exception;
	
	/**
	 * 
	* @Title: deleteOneUser 
	* @Description:  根据id删除一个用户
	* @param @param id
	* @param @return 
	* @param @throws Exception    
	* @return int    返回影响的行数
	* @throws
	 */
	public int deleteOneUser(int id) throws Exception;
	
	/**
	 * 
	* @Title: selectAllUsers 
	* @Description:  查询全部的用户信息
	* @param @return 
	* @param @throws Exception    
	* @return List<User>    返回一个用户集合
	* @throws
	 */
	public List<User> selectAllUsers() throws Exception;
}
