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
		//ͨ��session����getMapper�����õ��ӿڵĶ���
		UserMapper mapper = session.getMapper(UserMapper.class);  
		
//		User user = new User();
//		user.setUsername("abc");
//		User u = mapper.findUserByName(user);
//		System.out.println(u.getId());
		
		
		//���ɰ�װ��Ķ���
		QueryEntity entity = new QueryEntity();
		//�����û�����չ��
		UserExtend userExtend = new UserExtend();
		//ͨ��set������username��ֵ
		userExtend.setUsername("abc");
		//����װ�������userExtend���Ը�ֵ
		entity.setUserExtend(userExtend);
		//����UserMapper�ӿ�findUserByQueryEntity����
		User user = mapper.findUserByQueryEntity(entity);
		System.out.println(user.getPassword());
		
	}

}
