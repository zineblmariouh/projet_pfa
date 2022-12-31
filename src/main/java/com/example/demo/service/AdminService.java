package com.example.demo.service;

import com.example.demo.beans.Demande;
import com.example.demo.beans.User;
import com.example.demo.dao.DemandeDao;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private DemandeDao demandeDao;
    @Autowired
    private UserDao userDao;

    public List<Demande> findAll() {
        return demandeDao.findAll();
    }

    public List<User> findAllUser() {
        return userDao.findAll();
    }

}
