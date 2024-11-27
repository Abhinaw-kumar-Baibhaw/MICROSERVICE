package com.example.MicroRatingServices.controller;

import com.example.MicroRatingServices.entities.Rating;
import com.example.MicroRatingServices.seriveces.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.ok(ratingService.create(rating));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Rating>> getAll(){
        return ResponseEntity.ok(ratingService.getRatings());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getUserById(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
