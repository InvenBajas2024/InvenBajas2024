
package com.example.proyectoApps.Servicio;

import com.example.proyectoApps.Entidad.Login;
import com.example.proyectoApps.Repositorio.RepositorioLogin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLogin {
    @Autowired
    RepositorioLogin rLogin;
    
    public List<Login> obtenerLogins(){
        return rLogin.findAll();
    }
    
    public boolean insertarNuevoUsuario(Login l){
        boolean respuesta = false;
        try{
            rLogin.save(l);
            respuesta = true;
        }catch(Exception ex){
            respuesta=false;
        }
        
        return respuesta;
    }
    
    public List<Login> eliminarBaja(int id){
        Login lg = rLogin.getReferenceById(id);
        rLogin.delete(lg);
        return rLogin.findAll();
    }
    
    public boolean actualizarBaja(Login l){
        boolean respuesta = false;
        
        try{
            rLogin.save(l);
            respuesta = true;
        }catch(Exception ex){
            respuesta=false;
        }
        
        return respuesta;
    }
    
    public Optional<Login> obtenerUnUsuario(int id){
        return rLogin.findById(id);
    }
}
