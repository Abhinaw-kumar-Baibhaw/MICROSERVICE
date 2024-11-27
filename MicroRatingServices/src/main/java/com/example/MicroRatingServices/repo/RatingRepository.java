package com.example.MicroRatingServices.repo;

import com.example.MicroRatingServices.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,String> {

    List<Rating> findByUserId(String id);

    List<Rating> findByHotelId(String hotelId);
}
