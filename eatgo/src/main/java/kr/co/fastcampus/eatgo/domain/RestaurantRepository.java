package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository(){
        restaurants.add(new Restaurant(1004L,"Bob Zip", "Seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
    }

    public List<Restaurant> findAll() {

        return restaurants;
    }

    public Restaurant findById(Long id) {
        return restaurants.stream()
                //Java8 버전 추가된 기능
                .filter(r -> r.getId().equals(id))
                .findFirst()
//                .get();
                .orElse(null);
    }
}
