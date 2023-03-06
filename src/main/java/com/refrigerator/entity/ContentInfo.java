package com.refrigerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentInfo {
    private Integer content_id ;
    private String content_name ;
    private String content_image ;
}
