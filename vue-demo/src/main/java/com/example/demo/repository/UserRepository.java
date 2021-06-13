package com.example.demo.repository;

import com.example.demo.model.BoardInfo;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    @Query("SELECT user FROM User user")
    @Transactional(readOnly = true)
    List<BoardInfo> findUser();

    void save(User user);
}
