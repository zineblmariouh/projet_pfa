package com.example.demo.ws;

import com.example.demo.beans.Demande;
import com.example.demo.beans.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.DemandeService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AdminProvided {
    @Autowired
    private DemandeService demandeService;
    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/demande/all")
    public List<Demande> findAll() {
        return demandeService.findAll();
    }

    @GetMapping("/admin/user/all")
    public List<User> findAllUser() {
        return adminService.findAllUser();
    }



}
