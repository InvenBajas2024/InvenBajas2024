
package com.example.proyectoApps.Repositorio;

import com.example.proyectoApps.Entidad.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLogin extends JpaRepository<Login, Integer>{
    
}
