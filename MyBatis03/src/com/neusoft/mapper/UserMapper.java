package com.neusoft.mapper;

import com.neusoft.bean.QueryEntity;
import com.neusoft.bean.User;

public interface UserMapper {
    public User findUserByName(User user);
    public User findUserByQueryEntity(QueryEntity entity);
}
