package com.jsp.rating.service.dao;

import com.jsp.rating.service.data.entities.Rating;

import java.util.List;

public interface RatingDAOService {

    Rating createRating(Rating rating);
    List<Rating> getAllRating();
    Rating getRating(String ratingId);
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);
    void deleteRating(String ratingId);
}
