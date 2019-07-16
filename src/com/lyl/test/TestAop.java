package com.lyl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyl.entity.User;
import com.lyl.service.UserService;

/**
 *@Title: TestAop 
 * @Description: 
 * @date: 2019年7月15日 下午10:55:49
 */
public class TestAop {
	
	@Test
	public void test(){

		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) context.getBean("service");
		
		User user = new User();
		user.setId(1);
        user.setUsername("test2");
        user.setPassword("test123");
        user.setEmail("110@China.com");
        
        userService.addNewUser(user);
        
        userService.select("李彦雷");
		
	}

}
