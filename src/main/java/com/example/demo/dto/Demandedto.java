package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Demandedto {
    private int id;
    private Date date;
    private String descriptionBesoin;
    private String etat;
    private String type;
}
