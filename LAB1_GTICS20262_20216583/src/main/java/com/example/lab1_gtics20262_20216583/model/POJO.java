package com.example.lab1_gtics20262_20216583.model;

import java.time.LocalDate;

public class POJO {
    private String  nombre;
    private String tipo;
    private Integer codigoActivo;
    private LocalDate fechaAdquision;

    public POJO(String tipo, String nombre, Integer codigoActivo, LocalDate fechaAdquision) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigoActivo = codigoActivo;
        this.fechaAdquision = fechaAdquision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoActivo() {
        return codigoActivo;
    }

    public void setCodigoActivo(Integer codigoActivo) {
        this.codigoActivo = codigoActivo;
    }

    public LocalDate getFechaAdquision() {
        return fechaAdquision;
    }

    public void setFechaAdquision(LocalDate fechaAdquision) {
        this.fechaAdquision = fechaAdquision;
    }
}
