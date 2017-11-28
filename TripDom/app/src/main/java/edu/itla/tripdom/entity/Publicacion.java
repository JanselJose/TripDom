package edu.itla.tripdom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jaesj on 11/15/2017.
 */

public class Publicacion {

    public int id;
    public Date fecha;
    public Date fechaViaje;
    public Float costo;
    public String descripcion;
    public String status;
    public Usuario usuario;
    public String origen;
    List <PublicacionDetalle> detalle;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PublicacionDetalle> getDetalle() {
        return detalle;
    }
    public void addDetalle (PublicacionDetalle pd) {
        if (detalle==null){
            detalle=new ArrayList<>();
        }
        pd.setPublicacion(this);
        detalle.add(pd);

        }
    }

