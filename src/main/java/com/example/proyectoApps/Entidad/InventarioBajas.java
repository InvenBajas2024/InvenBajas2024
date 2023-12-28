
package com.example.proyectoApps.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Inventario")
public class InventarioBajas {
    @Id
    private int id;
    
    @Column(length = 50)
    private String nombreSolicitante;
    private int numPersonal;
    private String correoInstitucional;
    private String entidadAcademica;
    private String tipoEquipo;
    private String marca;
    private String modelo;
    private String noInventario;
    private String noSerie;
    private String discoDuro;
    private int cantidadDD;
    private String tipoDD;
    private String capacidadDD;
    private String memoriaRAM;
    private int cantidadMemoriasRam;
    private String tipoRAM;
    private String capacidadRAM;
    private String tipoDictamen;
    private String descripcionDetallada;

    public InventarioBajas() {
    }

    public InventarioBajas(int id, String nombreSolicitante, int numPersonal, String correoInstitucional, String entidadAcademica, String tipoEquipo, String marca, String modelo, String noInventario, String noSerie, String discoDuro, int cantidadDD, String tipoDD, String capacidadDD, String memoriaRAM, int cantidadMemoriasRam, String tipoRAM, String capacidadRAM, String tipoDictamen, String descripcionDetallada) {
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.numPersonal = numPersonal;
        this.correoInstitucional = correoInstitucional;
        this.entidadAcademica = entidadAcademica;
        this.tipoEquipo = tipoEquipo;
        this.marca = marca;
        this.modelo = modelo;
        this.noInventario = noInventario;
        this.noSerie = noSerie;
        this.discoDuro = discoDuro;
        this.cantidadDD = cantidadDD;
        this.tipoDD = tipoDD;
        this.capacidadDD = capacidadDD;
        this.memoriaRAM = memoriaRAM;
        this.cantidadMemoriasRam = cantidadMemoriasRam;
        this.tipoRAM = tipoRAM;
        this.capacidadRAM = capacidadRAM;
        this.tipoDictamen = tipoDictamen;
        this.descripcionDetallada = descripcionDetallada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getEntidadAcademica() {
        return entidadAcademica;
    }

    public void setEntidadAcademica(String entidadAcademica) {
        this.entidadAcademica = entidadAcademica;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNoInventario() {
        return noInventario;
    }

    public void setNoInventario(String noInventario) {
        this.noInventario = noInventario;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public int getCantidadDD() {
        return cantidadDD;
    }

    public void setCantidadDD(int cantidadDD) {
        this.cantidadDD = cantidadDD;
    }

    public String getTipoDD() {
        return tipoDD;
    }

    public void setTipoDD(String tipoDD) {
        this.tipoDD = tipoDD;
    }

    public String getCapacidadDD() {
        return capacidadDD;
    }

    public void setCapacidadDD(String capacidadDD) {
        this.capacidadDD = capacidadDD;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCantidadMemoriasRam() {
        return cantidadMemoriasRam;
    }

    public void setCantidadMemoriasRam(int cantidadMemoriasRam) {
        this.cantidadMemoriasRam = cantidadMemoriasRam;
    }

    public String getTipoRAM() {
        return tipoRAM;
    }

    public void setTipoRAM(String tipoRAM) {
        this.tipoRAM = tipoRAM;
    }

    public String getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(String capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public String getTipoDictamen() {
        return tipoDictamen;
    }

    public void setTipoDictamen(String tipoDictamen) {
        this.tipoDictamen = tipoDictamen;
    }

    public String getDescripcionDetallada() {
        return descripcionDetallada;
    }

    public void setDescripcionDetallada(String descripcionDetallada) {
        this.descripcionDetallada = descripcionDetallada;
    }

    
    
    
}
