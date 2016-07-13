package com.example.g5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getCanonicalName(),"Se ha iniciado la app");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona("Jorge", 29);
        Log.i(getClass().getCanonicalName(),"Se ha creado una persona");

        String nombre_persona = persona.getName();

        Log.i(getClass().getCanonicalName(),"La persona creada se llama " + nombre_persona);

        int numero_letras = nombre_persona.length();

        Log.i(getClass().getCanonicalName(),nombre_persona + " tiene " + numero_letras + " letras");

        Persona alumno = new Alumno(9);

        Persona persona_alumno = (Persona)alumno; //CASTING -> SUPRACASTING

        Alumno alumno2 = (Alumno)persona_alumno; //INFRACASTING

        if (alumno instanceof Persona)
        {
            //el alumno es una persona
            Log.d(getClass().getCanonicalName(),"El alumno es persona");

            String nombre_alumno =  alumno.getName();

            if (nombre_alumno != null)            {
                Log.d(getClass().getCanonicalName(),"El nombre del alumno NO es nulo");
            }else{
                Log.d(getClass().getCanonicalName(),"El nombre del alumno SI es nulo");
            }

            try{
                Log.d(getClass().getCanonicalName(),"Numero de letras del nombre alumno = " + nombre_alumno.length());
            }
            catch (Throwable t){
                Log.d(getClass().getCanonicalName(),"ERROR",t);
            }
        }


        EjerciciosRepaso ejerciciosRepaso =

    }
}
