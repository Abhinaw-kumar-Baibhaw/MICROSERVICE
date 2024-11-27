package com.example.MicroHotelServices.services;

import com.example.MicroHotelServices.entities.Hotel;

import java.util.List;

public interface HotelServices {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);
}
