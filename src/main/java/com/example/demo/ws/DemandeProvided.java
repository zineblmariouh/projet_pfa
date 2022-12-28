package com.example.demo.ws;

import com.example.demo.beans.Demande;
import com.example.demo.dao.DemandeDao;
import com.example.demo.dto.Demandedto;
import com.example.demo.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DemandeProvided {
    @Autowired
    private DemandeDao demandeDao;
    @Autowired
    private DemandeService demandeService;

    @PostMapping("/user/save/demande")
    public ResponseEntity<Demande> ajouterDemande(@RequestBody Demandedto demandedto) {
        Demande newDemande = demandeService.ajouterDemande(demandedto);
        return new ResponseEntity<>(newDemande, HttpStatus.CREATED);
    }
    @DeleteMapping("/user/delete/demande/{id}")
    public Demande deleteById(@PathVariable int id) {
        return demandeService.deleteById(id);
    }

    @GetMapping("/user/demande/all")
    public List<Demande> findAll() {
        return demandeService.findAll();
    }

}
