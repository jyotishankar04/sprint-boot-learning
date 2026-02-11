package com.devsuvam.projects.airBnb.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class HotelContactInfo {
    private String address;
    private String phoneNo;
    private String email;
    private String location;
}
