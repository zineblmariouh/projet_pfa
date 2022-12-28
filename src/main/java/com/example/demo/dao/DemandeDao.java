package com.example.demo.dao;

import com.example.demo.beans.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemandeDao extends JpaRepository<Demande, Integer> {
    Optional<Demande> findById(int id);

    Demande save(Demande demande);

    Demande deleteById(int id);

}
