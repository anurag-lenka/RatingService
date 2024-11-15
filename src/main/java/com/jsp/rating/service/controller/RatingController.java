package com.jsp.rating.service.controller;

import com.jsp.rating.service.data.dto.ApiResponse;
import com.jsp.rating.service.data.dto.RatingDTO;
import com.jsp.rating.service.data.entities.Rating;
import com.jsp.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody RatingDTO ratingDTO){
        return ratingService.createRating(ratingDTO);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return ratingService.getAllRatings();
    }

    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating> getRating(@PathVariable String ratingId){
        return ratingService.getRating(ratingId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId){
        return ratingService.getRatingByUserId(userId);
    }

    @GetMapping("hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId){
        return ratingService.getRatingByHotelId(hotelId);
    }

    @DeleteMapping("/{ratingId}")
    public ResponseEntity<ApiResponse> deleteRating(@PathVariable String ratingId){
        return ratingService.deleteRating(ratingId);
    }

    @PutMapping("/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable String ratingId, @RequestBody RatingDTO dto){
        return ratingService.updateRating(ratingId, dto);
    }

}
