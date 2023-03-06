package com.refrigerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storedtl {
    private Integer storeId=null ;
    private Integer refrigeratorId ;
    private Integer contentId ;
    private Integer storeLayerId ;
    private Double contentAmount ;
    private String contentUnit ;
    private Date storeOnDate ;
    private Date qualityGuaranteeBefore ;
}
