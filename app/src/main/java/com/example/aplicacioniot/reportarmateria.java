package com.example.aplicacioniot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class reportarmateria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reportarmateria);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void reportemateria1(View view) {
        Intent i = new Intent(this, reportemateria_1.class);
        startActivity(i);

    }
    public void reportemateria2(View view) {
        Intent i = new Intent(this, reportemateria_2.class);
        startActivity(i);

    }
    public void reportemateria3(View view) {
        Intent intent = new Intent(this, reportemateria_3.class);
        startActivity(intent);

    }
    public void volver(View view) {
        Intent i = new Intent(this, lenguaje.class);
        startActivity(i);

    }
}