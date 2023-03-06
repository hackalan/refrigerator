package com.refrigerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Refrigerator {
    private Integer refrigeratorId ;
    private String refrigeratorName ;
    private Integer brandModelId ;
    private Integer holdbyUserId ;
    private Double tempCooler ;
    private Double tempPreserve ;
    private Double tempFrezzer ;
}
