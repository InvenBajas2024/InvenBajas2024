
package com.example.proyectoApps.Entidad;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Inventario")
public class InventarioBajas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Column(length = 100)
    private String noInventario;
    
    private String edificio;
    private String salon;
    
    private String tipoEquipo;
    private String marca;
    private String modelo;
    private String noSerie;
    //componentes DD
    private String marcaDiscoDuroUno;
    private String modeloDiscoDuroUno;
    private String serieDiscoDuroUno;
    private String tipoDiscoDuroUno;
    private String capacidadDiscoDuroUno;
    private String tipoBorradoDiscoDuroUno;
    
    private String marcaDiscoDuroDos;
    private String modeloDiscoDuroDos;
    private String serieDiscoDuroDos;
    private String tipoDiscoDuroDos;
    private String capacidadDiscoDuroDos;
    private String tipoBorradoDiscoDuroDos;
    //componentes RAM
    private String marcaRamUno;
    private String tipoRamUno;
    private String capacidadRamUno;
    
    private String marcaRamDos;
    private String tipoRamDos;
    private String capacidadRamDos;
    //Dictamen
    private String tipoDictamen;
    private String descripcionDetallada;

    public InventarioBajas() {
    }

    public InventarioBajas(int id, String noInventario, String edificio, String salon, String tipoEquipo, String marca, String modelo, String noSerie, String marcaDiscoDuroUno, String modeloDiscoDuroUno, String serieDiscoDuroUno, String tipoDiscoDuroUno, String capacidadDiscoDuroUno, String tipoBorradoDiscoDuroUno, String marcaDiscoDuroDos, String modeloDiscoDuroDos, String serieDiscoDuroDos, String tipoDiscoDuroDos, String capacidadDiscoDuroDos, String tipoBorradoDiscoDuroDos, String marcaRamUno, String tipoRamUno, String capacidadRamUno, String marcaRamDos, String tipoRamDos, String capacidadRamDos, String tipoDictamen, String descripcionDetallada) {
        this.id = id;
        this.noInventario = noInventario;
        this.edificio = edificio;
        this.salon = salon;
        this.tipoEquipo = tipoEquipo;
        this.marca = marca;
        this.modelo = modelo;
        this.noSerie = noSerie;
        this.marcaDiscoDuroUno = marcaDiscoDuroUno;
        this.modeloDiscoDuroUno = modeloDiscoDuroUno;
        this.serieDiscoDuroUno = serieDiscoDuroUno;
        this.tipoDiscoDuroUno = tipoDiscoDuroUno;
        this.capacidadDiscoDuroUno = capacidadDiscoDuroUno;
        this.tipoBorradoDiscoDuroUno = tipoBorradoDiscoDuroUno;
        this.marcaDiscoDuroDos = marcaDiscoDuroDos;
        this.modeloDiscoDuroDos = modeloDiscoDuroDos;
        this.serieDiscoDuroDos = serieDiscoDuroDos;
        this.tipoDiscoDuroDos = tipoDiscoDuroDos;
        this.capacidadDiscoDuroDos = capacidadDiscoDuroDos;
        this.tipoBorradoDiscoDuroDos = tipoBorradoDiscoDuroDos;
        this.marcaRamUno = marcaRamUno;
        this.tipoRamUno = tipoRamUno;
        this.capacidadRamUno = capacidadRamUno;
        this.marcaRamDos = marcaRamDos;
        this.tipoRamDos = tipoRamDos;
        this.capacidadRamDos = capacidadRamDos;
        this.tipoDictamen = tipoDictamen;
        this.descripcionDetallada = descripcionDetallada;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoInventario() {
        return noInventario;
    }

    public void setNoInventario(String noInventario) {
        this.noInventario = noInventario;
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

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getMarcaDiscoDuroUno() {
        return marcaDiscoDuroUno;
    }

    public void setMarcaDiscoDuroUno(String marcaDiscoDuroUno) {
        this.marcaDiscoDuroUno = marcaDiscoDuroUno;
    }

    public String getModeloDiscoDuroUno() {
        return modeloDiscoDuroUno;
    }

    public void setModeloDiscoDuroUno(String modeloDiscoDuroUno) {
        this.modeloDiscoDuroUno = modeloDiscoDuroUno;
    }

    public String getSerieDiscoDuroUno() {
        return serieDiscoDuroUno;
    }

    public void setSerieDiscoDuroUno(String serieDiscoDuroUno) {
        this.serieDiscoDuroUno = serieDiscoDuroUno;
    }

    public String getTipoDiscoDuroUno() {
        return tipoDiscoDuroUno;
    }

    public void setTipoDiscoDuroUno(String tipoDiscoDuroUno) {
        this.tipoDiscoDuroUno = tipoDiscoDuroUno;
    }

    public String getCapacidadDiscoDuroUno() {
        return capacidadDiscoDuroUno;
    }

    public void setCapacidadDiscoDuroUno(String capacidadDiscoDuroUno) {
        this.capacidadDiscoDuroUno = capacidadDiscoDuroUno;
    }

    public String getTipoBorradoDiscoDuroUno() {
        return tipoBorradoDiscoDuroUno;
    }

    public void setTipoBorradoDiscoDuroUno(String tipoBorradoDiscoDuroUno) {
        this.tipoBorradoDiscoDuroUno = tipoBorradoDiscoDuroUno;
    }

    public String getMarcaDiscoDuroDos() {
        return marcaDiscoDuroDos;
    }

    public void setMarcaDiscoDuroDos(String marcaDiscoDuroDos) {
        this.marcaDiscoDuroDos = marcaDiscoDuroDos;
    }

    public String getModeloDiscoDuroDos() {
        return modeloDiscoDuroDos;
    }

    public void setModeloDiscoDuroDos(String modeloDiscoDuroDos) {
        this.modeloDiscoDuroDos = modeloDiscoDuroDos;
    }

    public String getSerieDiscoDuroDos() {
        return serieDiscoDuroDos;
    }

    public void setSerieDiscoDuroDos(String serieDiscoDuroDos) {
        this.serieDiscoDuroDos = serieDiscoDuroDos;
    }

    public String getTipoDiscoDuroDos() {
        return tipoDiscoDuroDos;
    }

    public void setTipoDiscoDuroDos(String tipoDiscoDuroDos) {
        this.tipoDiscoDuroDos = tipoDiscoDuroDos;
    }

    public String getCapacidadDiscoDuroDos() {
        return capacidadDiscoDuroDos;
    }

    public void setCapacidadDiscoDuroDos(String capacidadDiscoDuroDos) {
        this.capacidadDiscoDuroDos = capacidadDiscoDuroDos;
    }

    public String getTipoBorradoDiscoDuroDos() {
        return tipoBorradoDiscoDuroDos;
    }

    public void setTipoBorradoDiscoDuroDos(String tipoBorradoDiscoDuroDos) {
        this.tipoBorradoDiscoDuroDos = tipoBorradoDiscoDuroDos;
    }

    public String getMarcaRamUno() {
        return marcaRamUno;
    }

    public void setMarcaRamUno(String marcaRamUno) {
        this.marcaRamUno = marcaRamUno;
    }

    public String getTipoRamUno() {
        return tipoRamUno;
    }

    public void setTipoRamUno(String tipoRamUno) {
        this.tipoRamUno = tipoRamUno;
    }

    public String getCapacidadRamUno() {
        return capacidadRamUno;
    }

    public void setCapacidadRamUno(String capacidadRamUno) {
        this.capacidadRamUno = capacidadRamUno;
    }

    public String getMarcaRamDos() {
        return marcaRamDos;
    }

    public void setMarcaRamDos(String marcaRamDos) {
        this.marcaRamDos = marcaRamDos;
    }

    public String getTipoRamDos() {
        return tipoRamDos;
    }

    public void setTipoRamDos(String tipoRamDos) {
        this.tipoRamDos = tipoRamDos;
    }

    public String getCapacidadRamDos() {
        return capacidadRamDos;
    }

    public void setCapacidadRamDos(String capacidadRamDos) {
        this.capacidadRamDos = capacidadRamDos;
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

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    

}