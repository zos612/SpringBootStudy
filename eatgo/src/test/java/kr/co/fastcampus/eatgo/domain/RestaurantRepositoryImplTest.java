package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantRepositoryImplTest {

    @Test
    public void save(){
        RestaurantRepository repository = new RestaurantRepositoryImpl();

        int oldId = repository.findAll().size();

        Restaurant restaurant = new Restaurant("BeRyong","Seoul");
        repository.save(restaurant);

        assertThat(restaurant.getId(),is(1234L));

        int newId = repository.findAll().size();

        assertThat(newId - oldId, is(1));

    }

}