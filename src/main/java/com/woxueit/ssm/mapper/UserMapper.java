package com.woxueit.ssm.mapper;

import com.woxueit.ssm.pojo.User;

import java.util.List;

public interface UserMapper {

    //    @Select("select * from user")
    public List<User> findAll();
}
