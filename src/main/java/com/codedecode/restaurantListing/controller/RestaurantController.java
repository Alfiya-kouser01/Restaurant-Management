package com.codedecode.restaurantListing.controller;

import java.util.*;
import com.codedecode.restaurantListing.dto.RestaurantDTO;
import com.codedecode.restaurantListing.service.RestuarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    RestuarantService restuarantService;

    @GetMapping("/fetchAllRestaurants")
        public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurant() {
        List<RestaurantDTO> allRestaurants = restuarantService.findAllRestuarant();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }
}
