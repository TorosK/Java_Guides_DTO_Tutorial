package com.example.java_guides_dto_tutorial.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private long userID;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
