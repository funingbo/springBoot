package com.xx.day03.test.dao;

import com.xx.day03.test.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestDao {
    Test getName();
}
