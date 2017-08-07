package com.neusoft.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources; 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neusoft.bean.User;

public class MyBatisutil {

	public static SqlSession getSession() {
		SqlSession session=null;
		try {
			String res = "SqlMapConfig.xml";
	        //读配置文件得到一个输入流
			InputStream is = Resources.getResourceAsStream(res);
			//生成SqlSessionFactory对象
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			//得到一个Session
			session = sf.openSession(); 
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return session;
	}

}
