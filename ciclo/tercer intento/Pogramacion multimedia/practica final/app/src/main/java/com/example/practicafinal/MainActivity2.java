package com.example.practicafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView numtotal, tamaño_texto;
    Button resetear;
    SeekBar tam;
    GridLayout tabla;
    //int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tamaño_texto=findViewById(R.id.textView3);
        resetear=findViewById(R.id.reset);
        tam=findViewById(R.id.seekBar2);
        tabla=findViewById(R.id.gridimportante);



        Intent intent = getIntent();
        //Intent intent2 = getIntent();
        String dato= intent.getStringExtra(MainActivity.NOMBRE);
        String dato2= intent.getStringExtra(MainActivity.NOMBRE2);
        numtotal=findViewById(R.id.textView);
        numtotal.setText(getString(R.string.totales)+dato2);

        Integer num;
        num=Integer.parseInt(dato);

        for(int i=0;i<num;i++)
        {
            LinearLayout hola=new LinearLayout(MainActivity2.this);
            TextView amigos = new TextView(MainActivity2.this);
            ImageButton sumar = new ImageButton(MainActivity2.this);
            TextView valor = new TextView(MainActivity2.this);
            ImageButton restar = new ImageButton(MainActivity2.this);
            amigos.setText(getString(R.string.amigo)+(i+1));
            sumar.setImageResource(R.mipmap.sumar);
            valor.setText("0");
            restar.setImageResource(R.mipmap.restar);
            hola.addView(amigos);
            hola.addView(sumar);
            hola.addView(valor);
            hola.addView(restar);
            tabla.addView(hola);

            sumar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int total = Integer.parseInt(valor.getText().toString());
                    total++;
                    String palabranueva=Integer.toString(total);
                    valor.setText(palabranueva);
                }
            });

            restar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int total2 = Integer.parseInt(valor.getText().toString());
                    total2--;
                    String palabranueva2=Integer.toString(total2);
                    valor.setText(palabranueva2);
                }
            });

            resetear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for(int j=0;j<num;j++)
                    {
                        valor.setText("0");
                    }

                }
            });

        }





    }
}