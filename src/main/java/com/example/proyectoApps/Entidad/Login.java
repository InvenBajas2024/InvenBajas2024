
package com.example.proyectoApps.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //una entidad por tabla
@Table (name="login")
public class Login {
    @Id
    private int id;
    @Column(length = 50)
    private String usuario;
    private String password;
    private String tipo;

    public Login() {
    }

    public Login(int id, String usuario, String password, String tipo) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
