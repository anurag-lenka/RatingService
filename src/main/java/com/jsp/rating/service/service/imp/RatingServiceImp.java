package com.jsp.rating.service.service.imp;

import com.jsp.rating.service.dao.RatingDAOService;
import com.jsp.rating.service.data.dto.ApiResponse;
import com.jsp.rating.service.data.dto.RatingDTO;
import com.jsp.rating.service.data.entities.Rating;
import com.jsp.rating.service.service.RatingService;
import com.jsp.rating.service.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImp implements RatingService {

    @Autowired
    private RatingDAOService ratingDAOService;

    @Override
    public ResponseEntity<Rating> createRating(RatingDTO dto) {
        String id = UUID.randomUUID().toString();
        Rating rating = new Rating();
        rating.setRatingId(id);
        rating.setRating(dto.getRating());
        rating.setFeedBack(dto.getFeedBack());
        rating.setUserId(dto.getUserId());
        rating.setHotelId(dto.getHotelId());

        return ResponseEntity.ok(ratingDAOService.createRating(rating));
    }

    @Override
    public ResponseEntity<List<Rating>> getAllRatings() {
        List<Rating> ratings = ratingDAOService.getAllRating();
        return ResponseEntity.ok(ratings);
    }

    @Override
    public ResponseEntity<Rating> getRating(String ratingId) {
        Rating rating = ratingDAOService.getRating(ratingId);
        return ResponseEntity.ok(rating);
    }

    @Override
    public ResponseEntity<List<Rating>> getRatingByUserId(String userId) {
        List<Rating> ratingByUserId = ratingDAOService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratingByUserId);
    }

    @Override
    public ResponseEntity<List<Rating>> getRatingByHotelId(String hotelId) {
        List<Rating> ratingByHotelId = ratingDAOService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratingByHotelId);
    }

    @Override
    public ResponseEntity<ApiResponse> deleteRating(String ratingId) {
        ratingDAOService.deleteRating(ratingId);
        return ResponseUtil.getOkResponse("Deleted Successfully");
    }

    @Override
    public ResponseEntity<Rating> updateRating(String ratingId, RatingDTO dto) {
        Rating rating = ratingDAOService.getRating(ratingId);

        rating.setRating(dto.getRating());
        rating.setFeedBack(dto.getFeedBack());
        rating.setUserId(dto.getUserId());
        rating.setHotelId(dto.getHotelId());
        return ResponseEntity.ok(ratingDAOService.createRating(rating));
    }
}
