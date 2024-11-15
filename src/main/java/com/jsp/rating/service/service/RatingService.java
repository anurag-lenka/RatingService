package com.jsp.rating.service.service;

import com.jsp.rating.service.data.dto.ApiResponse;
import com.jsp.rating.service.data.dto.RatingDTO;
import com.jsp.rating.service.data.entities.Rating;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RatingService {

    ResponseEntity<Rating> createRating(RatingDTO dto);
    ResponseEntity<List<Rating>> getAllRatings();
    ResponseEntity<Rating> getRating(String ratingId);
    ResponseEntity<List<Rating>> getRatingByUserId(String userId);
    ResponseEntity<List<Rating>> getRatingByHotelId(String hotelId);
    ResponseEntity<ApiResponse> deleteRating(String ratingId);
    ResponseEntity<Rating> updateRating(String ratingId, RatingDTO dto);
}
