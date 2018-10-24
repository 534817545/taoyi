package cn.tedu.store.mapper;

import cn.tedu.store.bean.User;

public interface UserMapper {
	//插入user用户信息
	void insertUser(User user);
	//根据用户名查询用户信息
	User selectUserByUsername(String username);
	//根据邮箱查询user信息
	Integer selectByEmail(String email);
	//根据电话号码查询user信息
	Integer selectByPhone(String phone);
}
