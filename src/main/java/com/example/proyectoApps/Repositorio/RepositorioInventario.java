
package com.example.proyectoApps.Repositorio;

import com.example.proyectoApps.Entidad.InventarioBajas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioInventario extends JpaRepository<InventarioBajas, Integer>{
    
}
