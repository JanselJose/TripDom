package edu.itla.tripdom.entity;

/**
 * Created by jaesj on 11/15/2017.
 */

public class PublicacionDetalle {
    
    public int id;
    public Publicacion publicacion;
    public String lugar;
    public String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
}
