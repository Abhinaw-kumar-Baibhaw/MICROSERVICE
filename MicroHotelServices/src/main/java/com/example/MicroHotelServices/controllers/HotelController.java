package com.example.MicroHotelServices.controllers;

import com.example.MicroHotelServices.entities.Hotel;
import com.example.MicroHotelServices.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelServices hotelServices;

    @PostMapping("/create")
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
      return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.create(hotel));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> create(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelServices.get(hotelId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(hotelServices.getAll());
    }
}
