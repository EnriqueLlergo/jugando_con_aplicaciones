package com.example.jugando_con_aplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class saludoActivity extends AppCompatActivity {
    public static final String NUMERO = "NUMERO";
    TextView saludo;
    EditText editTextNumero;
    Button buttonvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        saludo = findViewById(R.id.textView);
        editTextNumero = findViewById(R.id.editTextNumber);
        buttonvolver = findViewById(R.id.buttonvolver);
        //para comprobar si hay intent
        Intent intent = getIntent();
        //NOMBRE, constante anterior
        String nombre = intent.getStringExtra(MainActivity.NOMBRE);
        //damos valor
        saludo.setText("Hola " + nombre);
        buttonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero=editTextNumero.getText().toString();
                //se pne vacio este intent, porque con el finish ya vuelve hacia atras
                Intent intento = new Intent();
                intento.putExtra(NUMERO, numero);
                //RESULT_OK, ya esta creada en el android
                setResult(RESULT_OK, intento);
                finish();
            }
        });
    }
}