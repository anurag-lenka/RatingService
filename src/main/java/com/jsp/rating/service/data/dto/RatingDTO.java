package com.jsp.rating.service.data.dto;

import lombok.Data;

@Data
public class RatingDTO {

    private String userId;
    private String hotelId;
    private String feedBack;
    private int rating;

}
