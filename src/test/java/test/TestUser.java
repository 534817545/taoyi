package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.IUserService;

public class TestUser {
	
	@Test
	public void testInsertUser() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper", UserMapper.class);
		User user=new User();
		user.setUsername("admin");
		user.setPassword("123456");
		user.setPhone("13800138000");
		user.setEmail("admin@tedu.cn");
		um.insertUser(user);
		
	}
	
	@Test
	public void testSelectByUsername() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper", UserMapper.class);
		User user=um.selectUserByUsername("admin");
		System.out.println(user);
	}
	
	@Test
	public void testRegister() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml","application-service.xml");
		IUserService is=ac.getBean("userService", IUserService.class);
		User user=new User();
		user.setUsername("小白");
		user.setPassword("123456");
		user.setPhone("13900139000");
		user.setEmail("xiaobai@tedu.cn");
		is.register(user);
		
	}
	
	@Test
	public void testSelectByEmail() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml","application-service.xml");
		UserMapper userMapper=ac.getBean("userMapper", UserMapper.class);
		Integer um=userMapper.selectByEmail("xiaobai1@tedu.cn");
		System.out.println(um);
	}
	
}


























