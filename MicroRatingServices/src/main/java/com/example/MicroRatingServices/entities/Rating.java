package com.example.MicroRatingServices.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    private String ratingId;

    private String userId;

    private String hotelId;

    private String feedback;

    private int rating;
}