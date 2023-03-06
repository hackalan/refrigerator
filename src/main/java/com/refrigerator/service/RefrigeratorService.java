package com.refrigerator.service;

import com.refrigerator.dao.BrandModelDao;
import com.refrigerator.dao.RefrigeratorDao;
import com.refrigerator.entity.BrandModel;
import com.refrigerator.entity.Refrigerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefrigeratorService {
    @Autowired
    private RefrigeratorDao refrigeratorDao;

    @Autowired
    private BrandModelDao brandModelDao;

    public List<Refrigerator> GetRefrigerators(Integer userid){
        return refrigeratorDao.selectByUserId(userid);
    }

    public BrandModel GetBrand(Integer brandid){
        return brandModelDao.selectById(brandid);
    }

}
