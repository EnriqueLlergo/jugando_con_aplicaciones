package com.example.jugando_con_aplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class saludoActivity extends AppCompatActivity {
    TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludo=findViewById(R.id.textView);
        //para comprobar si hay intent
        Intent intent = getIntent();
        //NOMBRE, constante anterior
        String nombre=intent.getStringExtra(MainActivity.NOMBRE);
        //damos valor
        saludo.setText("Hola"+nombre);
    }
}