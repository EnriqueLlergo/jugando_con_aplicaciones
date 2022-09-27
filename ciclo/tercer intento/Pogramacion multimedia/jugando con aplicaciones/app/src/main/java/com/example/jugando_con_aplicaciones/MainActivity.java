package com.example.jugando_con_aplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE = "NOMBRE";
    Button lanzar;
    EditText editTextnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lanzar=findViewById(R.id.buttonLanzar);
        editTextnombre=findViewById((R.id.editTextTextnombre));

        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //quien soy y adonde voy
                Intent intento = new Intent(MainActivity.this, saludoActivity.class);
                //Clave y valor
                //Nombre constante publica
                intento.putExtra(NOMBRE, editTextnombre.getText().toString());
                //abre la otra ventana
                startActivity(intento);
            }
        });
    }
}