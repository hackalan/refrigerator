package com.refrigerator.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator.entity.ContentInfo;
import com.refrigerator.entity.ContentShow;
import com.refrigerator.entity.Storedtl;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ContentInfoDao extends BaseMapper<ContentInfo> {
    @Select("Select storedtl.*,content_info.content_name," +
            " content_info.content_image,refrigerator.temp_cooler," +
            "refrigerator.temp_preserve,refrigerator.temp_frezzer from storedtl," +
            "content_info,refrigerator WHERE storedtl.content_id =" +
            "content_info.content_id AND storedtl.refrigerator_id = refrigerator.refrigerator_id " +
            "AND storedtl.refrigerator_id = refrigerator_id AND store_layer_id" +
            "= layer_id")
    public List<ContentShow> selectById(Integer refrigertor_id, Integer layer_id);

    @Insert("Insert into storedtl values=(null,#{refrigerator_id},#{content_id},#{store_layer_id}" +
            ",#{content_amount},#{content_unit},#{store_on_date},#{quality_guarantee_before)}) ")
    public boolean AddContent(Storedtl storedtl);
}
