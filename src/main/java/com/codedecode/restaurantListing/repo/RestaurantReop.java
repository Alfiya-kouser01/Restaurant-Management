package com.codedecode.restaurantListing.repo;

import com.codedecode.restaurantListing.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantReop  extends JpaRepository<Restaurant,Integer> {


}
