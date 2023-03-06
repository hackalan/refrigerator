package com.refrigerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorLayerInfo {
    private Integer layerId ;
    private String layerName ;
    private Double recommendLow ;
    private Double recommendHigh ;
}
