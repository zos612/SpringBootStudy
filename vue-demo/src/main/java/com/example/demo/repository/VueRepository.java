package com.example.demo.repository;

import com.example.demo.model.BoardInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface VueRepository extends Repository<BoardInfo, Integer> {

    @Query("SELECT boardInfo FROM BoardInfo boardInfo")
    @Transactional(readOnly = true)
    List<BoardInfo> findBoardInfo();
}
