package com.refrigerator.controller;

import com.refrigerator.entity.ContentShow;
import com.refrigerator.entity.Storedtl;
import com.refrigerator.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller("/content")
public class ContentController {
    @Autowired
    public ContentService contentService;
    /**
     * 物资展示
     * */
    @PostMapping("/show")
    public List<ContentShow> GetContentInfo(Integer refrigerator_id, Integer layer_id){
        return contentService.GetContent(refrigerator_id,layer_id);
    }
    /**
    * 添加物资
    * */
    @PostMapping("/add")
    public boolean AddContent(Storedtl storedtl){
        return contentService.AddContent(storedtl);
    }
    /**
     * 取出食材
     * @param storeId
     * @param amount
     * @return
     */
    @DeleteMapping("/food")
    public String takeFood(Integer storeId,Double amount){
        return contentService.takeFood(storeId,amount);
    }

    /**
     * 更改食材
     * @param st
     * @return
     */
    @PutMapping("/food")
    public String updateFood(Storedtl st){
        return contentService.updateFood(st);
    }
}
