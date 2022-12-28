package com.example.demo.service;

import com.example.demo.beans.Demande;
import com.example.demo.beans.Etat;
import com.example.demo.beans.Type;
import com.example.demo.dao.DemandeDao;
import com.example.demo.dao.EtatDao;
import com.example.demo.dao.TypeDao;
import com.example.demo.dto.Demandedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeService {

    @Autowired
    private DemandeDao demandeDao;
    @Autowired
    private EtatDao etatDao;
    @Autowired
    private TypeDao typeDao;


    public Demande ajouterDemande(Demandedto demandedto) {
        Demande demande = new Demande();

        demande.setId(demandedto.getId());
        demande.setDate(demandedto.getDate());
        demande.setDescriptionBesoin(demandedto.getDescriptionBesoin());


        demandeDao.save(demande);
        Etat etat = etatDao.findByDescription(demandedto.getEtat());
        demande.setEtat(etat);

        Type type = typeDao.findByTypeDemande(demandedto.getType());
        demande.setType(type);

        demandeDao.save(demande);
        return demande;
    }

    public Optional<Demande> findById(int id) {
        return demandeDao.findById(id);
    }

    @Transactional
    public Demande deleteById(int id) {
        return demandeDao.deleteById(id);
    }


    public List<Demande> findAll() {
        return demandeDao.findAll();
    }



}
