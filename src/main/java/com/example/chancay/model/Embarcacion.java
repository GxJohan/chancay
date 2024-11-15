package com.example.chancay.model;

import jakarta.persistence.*;

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
    @Column(length = 250, nullable = true)
    private String descipcion;

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

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    




}
