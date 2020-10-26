package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AfishaItem {
    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;
    private int count;

    private AfishaItem film1;
    private AfishaItem film2;
    private AfishaItem film3;
    private AfishaItem film4;
    private AfishaItem film5;
    private AfishaItem film6;
    private AfishaItem film7;
    private AfishaItem film8;
    private AfishaItem film9;
    private AfishaItem film10;



}






