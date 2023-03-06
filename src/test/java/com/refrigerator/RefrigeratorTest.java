package com.refrigerator;


import com.refrigerator.entity.BrandModel;
import com.refrigerator.entity.Refrigerator;
import com.refrigerator.service.RefrigeratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback
public class RefrigeratorTest {
    @Autowired
    private RefrigeratorService refrigeratorService;
    Integer rc=101;
    Integer rf=201;
    Integer mc=606;
    Integer mf=506;

    @Test
    public void GetFrigeratorTest(){//测试Getfrigerators方法
        if(refrigeratorService.GetRefrigerators(rc)!=null){
            System.out.println("getrc_correct");
        }
        else System.out.println("getrc_false");
        if(refrigeratorService.GetRefrigerators(rf)==null){
            System.out.println("getrf_correct");
        }
        else System.out.println("getrf_false");
    }
    @Test
    public void GetModeleTest(){//测试Get方法
        BrandModel bm=new BrandModel(606,"海尔","海尔",true,true,true,"haier_photo");
        if(refrigeratorService.GetBrand(mc)==bm){
            System.out.println("getrc_correct");
        }
        else System.out.println("getrc_false");
        if(refrigeratorService.GetBrand(mf)==null){
            System.out.println("getrf_correct");
        }
        else System.out.println("getrf_false");
    }

}
