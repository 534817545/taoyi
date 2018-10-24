package cn.tedu.store.service;

import cn.tedu.store.bean.User;

public interface IUserService {
	//注册用户信息
	void register(User user);
	//验证邮箱是否存在
	boolean checkEmail(String email);
	//判断电话号码是否存在
	boolean checkPhone(String phone);
	//验证用户名是否存在
	boolean checkUsername(String username);
	//登录
	User login(String username,String password);
}
