package com.example.demo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Demande {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @DateTimeFormat(pattern = "yyyy-M-dd")
    private Date date;
    private String descriptionBesoin;
    @ManyToOne
    private Etat etat;
    @ManyToOne
    private Type type;
}
