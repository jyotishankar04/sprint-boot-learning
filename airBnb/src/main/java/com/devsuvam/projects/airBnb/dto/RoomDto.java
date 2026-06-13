package com.devsuvam.projects.airBnb.dto;

import com.devsuvam.projects.airBnb.entity.Hotel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal basePrice;
    private  String[] photos;
    private  String[] amenities;
    private Integer capacity;
    private Integer totalCount;
    private Boolean active;
}
