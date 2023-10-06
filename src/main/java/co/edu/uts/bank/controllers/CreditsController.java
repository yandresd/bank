package co.edu.uts.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uts.bank.respositories.entities.ClienteEntity;
import co.edu.uts.bank.services.ClienteService;


@RestController
@RequestMapping("/creditos")
public class CreditsController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/{documento}")
    public ClienteEntity solicitarCredito(@PathVariable String documento){

        return clienteService.findByDocumento(documento);
        
    }



}
