package com.lyl.service;

import com.lyl.entity.User;

/**
 *@Title: UserService 
 * @Description: 
 * @date: 2019年7月15日 下午9:35:15
 */
public interface UserService {
	
	public void addNewUser(User user);
	
	public void select(String name);

}
