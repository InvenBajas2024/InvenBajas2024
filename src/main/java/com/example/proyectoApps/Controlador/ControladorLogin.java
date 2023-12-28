
package com.example.proyectoApps.Controlador;

import com.example.proyectoApps.Entidad.Login;
import com.example.proyectoApps.Repositorio.RepositorioLogin;
import com.example.proyectoApps.Servicio.ServicioLogin;
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
@RequestMapping("/login")
public class ControladorLogin {

    @Autowired
    RepositorioLogin rLogin;
    @Autowired
    ServicioLogin sLogin;
    
    @GetMapping
    public List<Login> getUsuarios(){
        return rLogin.findAll();
    }
    
    @GetMapping("/encontrarId")
    public Optional<Login> obtenerUsuario(int id){
        return sLogin.obtenerUnUsuario(id);
    }
    
    @PutMapping("")
    public List<Login> putActualizarUsuario (@RequestBody Login l){
        if(sLogin.actualizarBaja(l)){
            return sLogin.obtenerLogins();
        }else{
            return null;
        }
    }
    
    @GetMapping("/valida")
    public boolean getValidaUsuario(String usuario, String password) {
        int contador = 0;
        boolean respuesta=false;
        for (int i = 0; i < rLogin.findAll().size(); i++) {
            if (rLogin.findAll().get(i).getUsuario().equals(usuario) 
                    && rLogin.findAll().get(i).getPassword().equals(password)) {
                contador++;
            } 
        }
        if (contador==1) {
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    }
    
    @GetMapping("/admin")
    public boolean getAdmin(String usuario){
        int contador = 0;
         boolean respuesta=false;
        for (int i = 0; i < rLogin.findAll().size(); i++) {
            if (rLogin.findAll().get(i).getUsuario().equals(usuario) 
                    && rLogin.findAll().get(i).getTipo().equals("administrador")) {
                contador++;
            }
        }
        if (contador==1) {
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    }
    
    @PostMapping("")
    public List<Login> postInsertarNuevoUsuario (@RequestBody Login l){
        if(sLogin.insertarNuevoUsuario(l)){
            return sLogin.obtenerLogins();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("/id")
    public List<Login> eliminarBaja(int id){
        sLogin.eliminarBaja(id);
        return sLogin.obtenerLogins();
    }
    
    
    
}