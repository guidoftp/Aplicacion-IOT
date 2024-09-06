package com.example.aplicacioniot;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class inicio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId(); //Recupero el id de la opcion seleccionada
        if(id==R.id.op1){

            Intent i = new Intent(this,perfil.class);
            startActivity(i);


        }
        else if(id==R.id.op2){
            Toast.makeText(this,"Inicio",Toast.LENGTH_SHORT).show();
            //poner otra pagina
        }
        else if(id==R.id.op3){
            Toast.makeText(this,"Resenias",Toast.LENGTH_SHORT).show();
            //poner otra pagina
        }
        else if(id==R.id.op4){
            Toast.makeText(this,"Servicios",Toast.LENGTH_SHORT).show();
            //poner otra pagina
        }
        return super.onOptionsItemSelected(item);
    }

    public void inicio(View v){

        Intent i = new Intent(this,lenguaje.class);
        startActivity(i);
    }


}