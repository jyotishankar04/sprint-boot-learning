package com.devsuvam.projects.airBnb.dto;
import com.devsuvam.projects.airBnb.entity.HotelContactInfo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Data
public class HotelDto {

    private Long id;

    private String name;

    private String city;

    private  String[] photos;

    private  String[] amenities;

    private HotelContactInfo contactInfo;

    private Boolean active;
}
