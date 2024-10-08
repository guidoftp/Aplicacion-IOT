package com.example.aplicacioniot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lenguaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lenguaje);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void guardar (View v){

        Intent i = new Intent (this,inicio.class);
        startActivity(i);
    }
    //PARTE DE Asingatura

    public void calificacionAsig (View v){

        Intent i = new Intent (this,calificacionasignatura.class);
        startActivity(i);
    }

    public void reportarAsig (View v){

        Intent i = new Intent (this,reportarasignatura.class);
        startActivity(i);

    }
    //PARTE DE MATERIA

    public void editarMateria (View v){

        Intent i = new Intent (this,editarmateria.class);
        startActivity(i);
    }

    public void calificacionMat(View v){

        Intent i = new Intent (this,calificacionmateria.class);
        startActivity(i);
    }

    public void reportarMat (View v){

        Intent i = new Intent (this,reportarmateria.class);
        startActivity(i);
    }
}