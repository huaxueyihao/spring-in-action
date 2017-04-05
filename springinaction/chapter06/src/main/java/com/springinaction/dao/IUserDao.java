package com.springinaction.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springinaction.model.User;

/**
 * 
 * @ClassName: UserDao 
 * @Description: �û�dao�Ľӿ�
 * @author mao
 * @date 2017��3��29�� ����11:58:50 
 *
 */

public interface IUserDao {
	
	/**
	 * 
	* @Title: addUser 
	* @Description:  ����һ���û�
	* @param @param user    
	* @return int   ����Ӱ������� 
	* @throws
	 */
	public int addUser(User user) throws Exception;
	
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