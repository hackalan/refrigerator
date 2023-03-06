package com.refrigerator.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator.entity.Refrigerator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RefrigeratorDao extends BaseMapper<Refrigerator> {

    @Select("select * from Refrigerator where holdbyUserId = #{userid}")
    public List<Refrigerator> selectByUserId(Integer userid);
}
