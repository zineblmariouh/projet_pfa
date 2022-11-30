package com.example.demo.service;

import com.example.demo.beans.Demande;
import com.example.demo.dao.DemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeService {

    @Autowired
    private DemandeDao demandeDao;

    public Demande save(Demande demande) {
        demandeDao.save(demande);
        return demande;
    }

    public Optional<Demande> findById(Long id) {
        return demandeDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        return demandeDao.deleteById(id);
    }

    public List<Demande> findAll() {
        return demandeDao.findAll();
    }
}
