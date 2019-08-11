package kr.co.fastcampus.eatgo.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @Transient
    private List<MenuItem> menuItems = new ArrayList<MenuItem>(); //Json으로 돌려주기 위해 사용

    public Restaurant() {
    }

    public Restaurant(String name, String adress) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {

        return name + " in " + address;
    }

    public String getAddress() {
        return address;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }

}
