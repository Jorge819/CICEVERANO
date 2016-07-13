package com.example.g5.myapplication;

/**
 * Created by g5 on 12/7/16.
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona () {}

    public String getName(){
        return this.nombre;
    }
}
