package com.neusoft.bean;
/**
 * �û�����չ�࣬�̳���User��
 * @author admin
 *
 */
public class UserExtend extends User{
    private String lastLoginTime;

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
}
