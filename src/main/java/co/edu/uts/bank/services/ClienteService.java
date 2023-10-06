package co.edu.uts.bank.services;

import java.util.List;

import co.edu.uts.bank.respositories.entities.ClienteEntity;

public interface ClienteService {
    
    List<ClienteEntity> findAll();
    ClienteEntity findById(Long id);
    ClienteEntity save(ClienteEntity cliente);
    ClienteEntity update(ClienteEntity cliente, Long id);
    void delete(Long id);
    ClienteEntity findByDocumento(String documento);
    
}
