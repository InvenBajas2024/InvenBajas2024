
package com.example.proyectoApps.Servicio;

import com.example.proyectoApps.Entidad.InventarioBajas;
import com.example.proyectoApps.Repositorio.RepositorioInventario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioInventario {//jala del repositorio
    @Autowired
    RepositorioInventario rInventario;
    
    public List<InventarioBajas> obtenerBajas(){
        return rInventario.findAll();
    }
    
    public boolean insertarBaja(InventarioBajas ib){
        boolean respuesta = false;
        try{
            rInventario.save(ib);
            respuesta = true;
        }catch(Exception ex){
            respuesta=false;
        }
        
        return respuesta;
    }
    
    public boolean actualizarBaja(InventarioBajas ib){
        boolean respuesta = false;
        
        try{
            rInventario.save(ib);
            respuesta = true;
        }catch(Exception ex){
            respuesta=false;
        }
        
        return respuesta;
    }
    
    public Optional<InventarioBajas> obtenerUno(int id){
        return rInventario.findById(id);
    }
    
    public List<InventarioBajas> eliminarBaja(int id){
        InventarioBajas ib = rInventario.getReferenceById(id);
        rInventario.delete(ib);
        return rInventario.findAll();
    }
}
