package com.neusoft.bean;
/**
 * 用户的扩展类，继承了User类
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
