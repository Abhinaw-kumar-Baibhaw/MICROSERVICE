package com.example.MicroHotelServices.services.impl;

import com.example.MicroHotelServices.entities.Hotel;
import com.example.MicroHotelServices.exception.ResourceNotFoundException;
import com.example.MicroHotelServices.repo.HotelRepo;
import com.example.MicroHotelServices.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImplementation implements HotelServices {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel get(String id) {
      return   hotelRepo.findById(id).orElseThrow(() ->
              new ResourceNotFoundException("Hotel with given id is Not Found"));
    }
}
