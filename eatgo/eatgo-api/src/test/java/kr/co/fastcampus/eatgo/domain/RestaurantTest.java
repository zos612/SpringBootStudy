package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void create(){
        Restaurant restaurant = new Restaurant(1004L, "Bob Zip", "Seoul");

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob Zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void infomation(){
        Restaurant restaurant = new Restaurant(1004L,"Bob Zip", "Seoul");

        assertThat(restaurant.getInformation(), is("Bob Zip in Seoul"));
    }


}