package com.lyl.dao;

import com.lyl.entity.User;

/**
 *@Title: UserDao 
 * @Description: 
 * @date: 2019年7月15日 下午9:34:08
 */
public interface UserDao {
	
	public void save(User user);
	
	public void select(String name);

}
