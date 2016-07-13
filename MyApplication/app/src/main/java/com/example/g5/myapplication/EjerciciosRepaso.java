package com.example.g5.myapplication;

import android.widget.Switch;

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

        //Metodo acortado
        // valorDevuelto = (palabra.indexOf(letra) != -1);
        // ó
        // return (palabra.indexOf(letra) != -1)  //Super resumido, sin definir variable

        return valorDevuelto;

    }

    public int cuentaLetras (String palabra, char caracter){
        int nveces = 0;

        char[] arrayCadena = palabra.toCharArray();

        for (int i=0; i<arrayCadena.length; i++){
            if(arrayCadena[i]==caracter){
                nveces++;
            }
        }

        return nveces;
    }

    public String esPar (int num){

        String msg = "El número NO es par";

        if (num%2==0){
            msg = "El número es par";
        }

        return msg;
    }

    public String getNota (int num){

        String nota = "";

        switch (num){
            case 0: nota= "TERA SUSPENDIDO";
                break;
            case 1: nota= "KILO SUSPENDIDO";
                break;
            case 2: nota= "MEGA SUSPENDIDO";
                break;
            case 3: nota= "SUSPENDIDO";
                break;
            case 4: nota= "CASI APRUEBAS";
                break;
            case 5: nota= "APROBADO";
                break;
            case 6: nota= "BIEN";
                break;
            case 7: nota= "NOTABLE";
                break;
            case 8: nota= "NOTABLE ALTO";
                break;
            case 9: nota= "SOBRESALIENTE";
                break;
            case 10: nota= "MATRICULA DE HONOR";
                break;
            default: nota= "SUSPENSO POR SER UN VAGONETA";
                break;
        }

        return nota;
    }

    public String delReves (String cadena){

        char[] arrayCadena = cadena.toCharArray();
        char[] arrayAux = new char [9]; // no podemos definir array sin limite?
        int j = 0;
        for (int i=arrayCadena.length; i>0; i--){
            j = arrayCadena.length-i;
            arrayAux[j] = arrayCadena[i-1];
        }

        String newCadena = new String(arrayAux);

        return newCadena;
    }

    public String dameCadena (int num){

        String cadena = "";

        for (int i=0; i<=100; i+=num){
            cadena +=  i + ",";
        }

        return cadena;
    }

}
