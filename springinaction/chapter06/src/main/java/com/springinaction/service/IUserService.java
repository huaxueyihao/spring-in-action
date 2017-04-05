package com.springinaction.service;

import java.util.List;

import com.springinaction.model.User;

public interface IUserService {
	
	/**
	 * 
	* @Title: addUser 
	* @Description:  ��ɺ��һ���û���������һ���û�
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
	* @Description:  ����idɾ��һ���û�
	* @param @param id
	* @param @return 
	* @param @throws Exception    
	* @return int    ����Ӱ�������
	* @throws
	 */
	public int deleteOneUser(int id) throws Exception;
	
	/**
	 * 
	* @Title: selectAllUsers 
	* @Description:  ��ѯȫ�����û���Ϣ
	* @param @return 
	* @param @throws Exception    
	* @return List<User>    ����һ���û�����
	* @throws
	 */
	public List<User> selectAllUsers() throws Exception;
}
