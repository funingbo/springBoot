package com.xx.day03.user.dao;

import com.xx.day03.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    User getUser(int i);
}
