package com.example.aplicacioniot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tablaservicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tablaservicios);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void agregarmateria(View v){
        //agrega otra pagina

        Intent i = new Intent(this,agregar_asignatura.class);
        startActivity(i);

    }


    public void informes (View v){
        //agregar otra pag

        Intent i = new Intent(this,informes.class);
        startActivity(i);


    }
    public void reportes (View v){
        //agregar otra pag

        Intent i = new Intent(this,reportes.class);
        startActivity(i);


    }
}