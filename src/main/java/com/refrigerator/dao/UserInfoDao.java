package com.refrigerator.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
