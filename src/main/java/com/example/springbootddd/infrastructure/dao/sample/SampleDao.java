package com.example.springbootddd.infrastructure.dao.sample;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface SampleDao {

    @Select
    List<String> selectSampleData();
}

