package com.springinaction.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springinaction.model.User;

/**
 * 
 * @ClassName: UserDao 
 * @Description: 用户dao的接口
 * @author mao
 * @date 2017年3月29日 下午11:58:50 
 *
 */

public interface IUserDao {
	
	/**
	 * 
	* @Title: addUser 
	* @Description:  增加一个用户
	* @param @param user    
	* @return int   返回影响的行数 
	* @throws
	 */
	public int addUser(User user) throws Exception;
	
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
