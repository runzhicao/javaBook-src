package com.huifer.mybatis.mapper;

import com.huifer.mybatis.entity.HsSell;

public interface HsSellMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsSell record);

    int insertSelective(HsSell record);

    HsSell selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsSell record);

    int updateByPrimaryKey(HsSell record);
}