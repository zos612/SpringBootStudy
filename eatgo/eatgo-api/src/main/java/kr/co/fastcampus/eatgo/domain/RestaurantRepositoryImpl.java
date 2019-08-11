/*
package kr.co.fastcampus.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();


    public RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004L,"Bob Zip", "Seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
    }


//    public RestaurantRepository(){
//        restaurants.add(new Restaurant(1004L,"Bob Zip", "Seoul"));
//        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
//    }

    @Override
    public List<Restaurant> findAll() {

        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurants.stream()
                //Java8 버전 추가된 기능
                .filter(r -> r.getId().equals(id))
                .findFirst()
//                .get();
                .orElse(null);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        restaurant.setId(1234L);
        restaurants.add(restaurant);
        return restaurant;
    }
}
*/
