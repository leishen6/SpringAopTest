package com.lyl.service.impl;

import com.lyl.dao.UserDao;
import com.lyl.entity.User;
import com.lyl.service.UserService;

/**
 *@Title: UserServiceImpl 
 * @Description: 
 * @date: 2019年7月15日 下午9:35:43
 */
public class UserServiceImpl implements UserService	{

	 /**
     * 声明接口类型的引用.和具体实现类解耦合
     */
    private UserDao dao;

    /**
     * dao 属性的setter访问器,会被Spring调用,实现设值注入
     * 
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    /**
     * 调用用户的dao方法保存用户信息
     */
    public void addNewUser(User user) {
        dao.save(user);
    }
    
    /**
     * 根据名字查询邮箱
     */
	@Override
	public void select(String name) {
		dao.select(name);
	}

	
}
