package com.example.b2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botaoPrimos, botaoFibonacci, botaoFatorial
            ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoPrimos = findViewById(R.id.btn_numeroprimo);
        botaoFatorial = findViewById(R.id.btnAbrirFatorial);
        botaoFibonacci = findViewById(R.id.btnAbrirFibonacci);

        botaoFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fibonacci=new Intent(getApplicationContext(),TelaFibonacci.class);
                startActivity(fibonacci);
            }
        });

        botaoFatorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fatorial=new Intent(getApplicationContext(),TelaFatorial.class);
                startActivity(fatorial);
            }
        });

        botaoPrimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent primos=new Intent(getApplicationContext(),Primos.class);
                startActivity(primos);
            }
        });

    }
}