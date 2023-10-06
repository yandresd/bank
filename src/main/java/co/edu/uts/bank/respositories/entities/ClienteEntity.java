package co.edu.uts.bank.respositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class ClienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private String nombres;
    @Column(nullable = true)
    private String apellidos;
    @Column(nullable = true, unique = true)
    private String documento;
    @Column(nullable = true, unique = true)
    private String email;
    @Column(nullable = true)
    private String celular;
    @Column(nullable = true)
    private String direccion;
    



}
