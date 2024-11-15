package com.jsp.rating.service.data.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "rating_info")
@Data
public class Rating {

    @Id
    private String ratingId;

    @Field(value = "user_id")
    private String userId;

    @Field(value = "hotel_id")
    private String hotelId;

    @Field(value = "feedback")
    private String feedBack;

    @Field(value = "rating")
    private int  rating;

}
