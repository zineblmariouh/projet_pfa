package com.example.demo.dao;

import com.example.demo.beans.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDao extends JpaRepository<Etat, Long> {
    Etat findByDescription(String Description);
}
