
package com.example.proyectoApps.Controlador;

import com.example.proyectoApps.Entidad.InventarioBajas;
import com.example.proyectoApps.Servicio.ServicioInventario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario")
public class ControladorInventario {//jala del servicio
    @Autowired
    ServicioInventario sInventario;
    
    @GetMapping("/encontrarId")
    public Optional<InventarioBajas> obtenerUno(int id){
        return sInventario.obtenerUno(id);
    }
    
    @GetMapping("")
    public List<InventarioBajas> getBajas(){
        return sInventario.obtenerBajas();
    }
    
    @PostMapping("")
    public List<InventarioBajas> postInsertarBajas (@RequestBody InventarioBajas ib){
        if(sInventario.insertarBaja(ib)){
            return sInventario.obtenerBajas();
        }else{
            return null;
        }
    }
    
    @PutMapping("")
    public List<InventarioBajas> putActualizarBajas (@RequestBody InventarioBajas ib){
        if(sInventario.actualizarBaja(ib)){
            return sInventario.obtenerBajas();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("/id")
    public List<InventarioBajas> eliminarBaja(int id){
        sInventario.eliminarBaja(id);
        return sInventario.obtenerBajas();
    }
    
    
    
}
