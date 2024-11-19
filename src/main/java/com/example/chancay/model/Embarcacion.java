package com.example.chancay.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "embarcacion")
public class Embarcacion {
    
    //Creación de la clave primaria id auto_incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Columna Nombre de la embarcación
    @Column(length = 50, nullable = false)
    private String nombre;

    //Columna capacidad en toneladas de la carga
    @Column(nullable = false)
    private double capacidad;

    //Columna descripción de la embarcacion
    @Column(length = 250, nullable = false)
    private String descripcion;

    // Columna Fecha
    @Column(name = "fecha_programada", nullable = false)
    private LocalDate fechaProgramada;

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Add getter and setter
    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

}
