package com.neusoft.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources; 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neusoft.bean.QueryEntity;
import com.neusoft.bean.User;
import com.neusoft.bean.UserExtend;
import com.neusoft.mapper.UserMapper;
import com.neusoft.util.MyBatisutil;

public class Test {

	public static void main(String[] args) { 
		SqlSession session = MyBatisutil.getSession();
		//通过session调用getMapper方法得到接口的对象
		UserMapper mapper = session.getMapper(UserMapper.class);  
		
//		User user = new User();
//		user.setUsername("abc");
//		User u = mapper.findUserByName(user);
//		System.out.println(u.getId());
		
		
		//生成包装类的对象
		QueryEntity entity = new QueryEntity();
		//生成用户的扩展类
		UserExtend userExtend = new UserExtend();
		//通过set方法给username赋值
		userExtend.setUsername("abc");
		//给包装类包含的userExtend属性赋值
		entity.setUserExtend(userExtend);
		//调用UserMapper接口findUserByQueryEntity方法
		User user = mapper.findUserByQueryEntity(entity);
		System.out.println(user.getPassword());
		
	}

}
