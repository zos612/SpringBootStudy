package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
@Entity
@Table(name = "BOARD_INFO_TABLE")
public class BoardInfo {

    public int getBoardInfoIdx() {
        return boardInfoIdx;
    }

    public void setBoardInfoIdx(int boardInfoIdx) {
        this.boardInfoIdx = boardInfoIdx;
    }

    @Id
    @Column(name = "BOARD_INFO_IDX")
    int boardInfoIdx;

    public String getBoardInfoName() {
        return boardInfoName;
    }

    public void setBoardInfoName(String boardInfoName) {
        this.boardInfoName = boardInfoName;
    }

    @Column(name = "BOARD_INFO_NAME")
    String boardInfoName;
}
