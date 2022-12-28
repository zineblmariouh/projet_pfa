package com.example.demo.dao;

import com.example.demo.beans.Etat;
import com.example.demo.beans.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDao extends JpaRepository<Type, Long> {
    Type findByTypeDemande(String typeDemande);
}
