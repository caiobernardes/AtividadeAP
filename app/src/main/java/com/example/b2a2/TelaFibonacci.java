package com.example.b2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaFibonacci extends AppCompatActivity {
    EditText editVerificarFibonacci;
    TextView txtResultadoFibonacci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fibonacci);


        editVerificarFibonacci = findViewById(R.id.editCalcularFibonacci);
        txtResultadoFibonacci = findViewById(R.id.txtResultadoFibonacci);


    }

    public void calcularFibonacci(View view){
        int numeroVerificadoFibonacci = Integer.parseInt(editVerificarFibonacci.getText().toString());
        List<Integer> lista = new ArrayList<Integer>();
        int a = 1;
        int b = 0;
        int aux;
        for (int i =0; i<numeroVerificadoFibonacci; i++){
            lista.add(a);
            aux = a;
            a = a + b;
            b = aux;
        }
        txtResultadoFibonacci.setText("Sequência: " + lista);
    }

}