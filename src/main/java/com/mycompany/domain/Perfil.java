/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author cesar
 */
@Named
@RequestScoped
public class Perfil {
    private String nombre;
    private String carrera;
    private String foto;
    private String lenguajesDeProgramacion;
    private String basesDeDatos;
    private String proyectos;
    private String promedio;

    public Perfil() {
        this.nombre = "Cesar Espino / Jairo Jafet Alvarado Martinez";
        this.carrera = "Tecnologias de la Informacion y Comunicaciones";
        this.foto = "image/perfil3.jpg";
        this.lenguajesDeProgramacion = "java, c#, c++";
        this.basesDeDatos = "php";
        this.proyectos = "pagina web pay kawai";
        this.promedio = "90.19";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLenguajesDeProgramacion() {
        return lenguajesDeProgramacion;
    }

    public void setLenguajesDeProgramacion(String lenguajesDeProgramacion) {
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
    }

    public String getBasesDeDatos() {
        return basesDeDatos;
    }

    public void setBasesDeDatos(String basesDeDatos) {
        this.basesDeDatos = basesDeDatos;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
    
}

