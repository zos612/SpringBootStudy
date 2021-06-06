package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "BOARD_INFO_TABLE")
public class BoardInfo {

    @Id
    @Column(name = "BOARD_INFO_IDX")
    int boardInfoIdx;

    @Column(name = "BOARD_INFO_NAME")
    String boardInfoName;
}
