package com.example.demo.dao;

import com.example.demo.beans.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemandeDao extends JpaRepository<Demande, Long> {
    Optional<Demande> findById(Long id);

    void deleteById(Long id);

}
