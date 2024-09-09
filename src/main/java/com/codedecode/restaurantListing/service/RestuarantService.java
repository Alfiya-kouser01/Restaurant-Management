package com.codedecode.restaurantListing.service;

import com.codedecode.restaurantListing.Mapper.RestuarantMapper;
import com.codedecode.restaurantListing.dto.RestaurantDTO;
import com.codedecode.restaurantListing.entity.Restaurant;
import com.codedecode.restaurantListing.repo.RestaurantReop;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service

public class RestuarantService {
    @Autowired
    RestaurantReop restaurantReop;

    public List<RestaurantDTO> findAllRestuarant() {
        List<Restaurant> restaurants =  restaurantReop.findAll();
        List<RestaurantDTO> restaurantDTOList = restaurants.stream().map(restaurant ->  RestuarantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
        return restaurantDTOList;
    }
}
