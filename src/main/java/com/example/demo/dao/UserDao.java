package com.example.demo.dao;

import com.example.demo.beans.Demande;
import com.example.demo.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, String> {

    void deleteById(String userName);
}
