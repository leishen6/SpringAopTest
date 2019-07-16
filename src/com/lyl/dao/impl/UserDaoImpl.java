package com.lyl.dao.impl;

import com.lyl.dao.UserDao;
import com.lyl.entity.User;

/**
 *@Title: UserDaoImpl 
 * @Description: 
 * @date: 2019年7月15日 下午9:34:32
 */
public class UserDaoImpl implements UserDao{

	public void save(User user) {
        System.out.println("UserDaoImpl：保存用户信息到数据库");
    }

	@Override
	public void select(String name) {
		System.out.println(name +"的邮箱是163.com");
	}
	
}
