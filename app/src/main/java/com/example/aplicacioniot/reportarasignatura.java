package com.example.aplicacioniot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class reportarasignatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reportarasignatura);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void report1 (View v){
        Intent i = new Intent(this,reporte1.class);
        startActivity(i);

    }

    public void report2 (View v){
        Intent i = new Intent(this,reporte2.class);
        startActivity(i);

    }

    public void report3 (View v){
        Intent i = new Intent(this,reporte3.class);
        startActivity(i);

    }

    public void volver (View v){

        Intent i = new Intent(this,inicio.class);
        startActivity(i);

    }

}