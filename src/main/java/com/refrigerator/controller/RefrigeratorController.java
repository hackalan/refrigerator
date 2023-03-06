package com.refrigerator.controller;

import com.refrigerator.entity.BrandModel;
import com.refrigerator.entity.Refrigerator;
import com.refrigerator.service.RefrigeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller("/refrigerator")
public class RefrigeratorController {
    @Autowired
    public RefrigeratorService refrigeratorService;
    /**
     * 获取冰箱列表
     * @param userid
     * @return
     */
    @GetMapping
    public List<Refrigerator> GetRefrigerators(Integer userid){
        return refrigeratorService.GetRefrigerators(userid);
    }
    /**
     * 获取冰箱具体信息
     * @param brandid
     * @return
     */
    @PostMapping
    public BrandModel GetBrand(Integer brandid){
        return refrigeratorService.GetBrand(brandid);
    }

}
