package co.edu.uts.bank.respositories;

import org.springframework.data.repository.CrudRepository;

import co.edu.uts.bank.respositories.entities.ClienteEntity;


public interface ClienteRepository extends CrudRepository<ClienteEntity, Long>{
    
    ClienteEntity findByDocumento(String documento);
}
