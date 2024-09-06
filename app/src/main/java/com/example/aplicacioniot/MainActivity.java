package com.example.aplicacioniot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.iniciosesion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View v) {

        EditText campo1 = this.findViewById(R.id.correo); //ingresar y recuperar datos en la app
        String nombre = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.contrasenia);
        String contrasenia = campo2.getText().toString();

        if(nombre.equals("1") && contrasenia.equals("1")){ //credenciales para iniciar sesion
            Intent  i = new Intent(this, inicio.class); //de una pagina a otra
            startActivity(i);
        }else{
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }


        //System.out.println("Bienvenido");
        //Toast.makeText(this,"Se ha iniciado sesion correctamente",Toast.LENGTH_SHORT).show(); //muestra en la app un mensaje

    }

    public void registrarse(View v){

        Intent i = new Intent(this,registrarse.class);
        startActivity(i);

    }


    public void olvididarcontrasenia(View v){
    }

}