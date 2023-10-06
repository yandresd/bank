package co.edu.uts.bank.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uts.bank.respositories.ClienteRepository;
import co.edu.uts.bank.respositories.entities.ClienteEntity;
import co.edu.uts.bank.services.ClienteService;
import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    @Transactional
    public List<ClienteEntity> findAll() {
        return (List<ClienteEntity>) clienteRepository.findAll();
    }

    @Override
    public ClienteEntity findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public ClienteEntity update(ClienteEntity cliente, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public ClienteEntity findByDocumento(String documento) {
        return clienteRepository.findByDocumento(documento);
    }
    

}
