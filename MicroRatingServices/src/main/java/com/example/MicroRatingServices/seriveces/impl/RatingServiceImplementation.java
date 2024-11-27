package com.example.MicroRatingServices.seriveces.impl;

import com.example.MicroRatingServices.entities.Rating;
import com.example.MicroRatingServices.repo.RatingRepository;
import com.example.MicroRatingServices.seriveces.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class RatingServiceImplementation implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
