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
	        //�������ļ��õ�һ��������
			InputStream is = Resources.getResourceAsStream(res);
			//����SqlSessionFactory����
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			//�õ�һ��Session
			session = sf.openSession(); 
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return session;
	}

}
