package com.codedecode.restaurantListing.controller;

import java.util.*;
import com.codedecode.restaurantListing.dto.RestaurantDTO;
import com.codedecode.restaurantListing.service.RestuarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("fetchById/{id}")
    public ResponseEntity<RestaurantDTO> findRestaurantById(@PathVariable Integer id){
       return restuarantService.findRestaurantById(id);
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO){
        RestaurantDTO restaurantAdded = restuarantService.addRestaurantInDB(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
    }


}
