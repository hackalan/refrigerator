package com.refrigerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandModel {
    private Integer brandModelId ;
    private String brand ;
    private String model ;
    private Boolean hasCooler ;
    private Boolean hasPreserve ;
    private Boolean hasFrezzer ;
    private String image ;
}
