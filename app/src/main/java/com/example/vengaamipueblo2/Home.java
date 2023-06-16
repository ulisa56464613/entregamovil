package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //asociando los atributos de tipo boton a los ID que pusimos en xml
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        //escuchando los eventos de click en el boton
        botonHoteles.setOnClickListener(new v){
            Toast.makeText(this, "estamos haciendo click en Hoteles", Toast.LENGTH_SHORT).show();
        };

    }
}