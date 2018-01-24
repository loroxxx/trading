package com.jinhui.mapper;

import com.jinhui.entity.ChnInfo;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface ChnInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChnInfo record);

    int insertSelective(ChnInfo record);

    ChnInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChnInfo record);

    int updateByPrimaryKey(ChnInfo record);
}