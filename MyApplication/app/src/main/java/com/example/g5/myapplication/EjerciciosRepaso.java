package com.example.g5.myapplication;

/**
 * Created by g5 on 13/7/16.
 */
public class EjerciciosRepaso {

    private String palabra;
    private char letra;

    public EjerciciosRepaso () {}

    public boolean existPalabra (String palabra, char letra){

        boolean valorDevuelto = false;

        if(palabra.indexOf(letra) != -1){
            valorDevuelto = true;
        }
        return valorDevuelto;
    }

}
