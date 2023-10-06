package co.edu.uts.bank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uts.bank.respositories.entities.ClienteEntity;
import co.edu.uts.bank.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/")
    public ClienteEntity save(@RequestBody ClienteEntity cliente){
        return clienteService.save(cliente);
    }
    
    @GetMapping("/{id}")
    public ClienteEntity findById(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @GetMapping("/")
    public List<ClienteEntity> findAll(){
        return clienteService.findAll();
    }


}
