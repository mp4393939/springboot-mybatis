package com.winter.mapper;

import com.winter.model.CardMapping;

public interface CardMappingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CardMapping record);

    int insertSelective(CardMapping record);

    CardMapping selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CardMapping record);

    int updateByPrimaryKey(CardMapping record);
}