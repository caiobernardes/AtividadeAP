package com.example.b2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaFatorial extends AppCompatActivity {
    Button botaoVerificarFatorial;
    EditText editVerificaFatorial;
    TextView txtResultadoFatorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fatorial);


        botaoVerificarFatorial = findViewById(R.id.btn_CalcularFatorial);
        editVerificaFatorial = findViewById(R.id.editCalcularFatorial);
        txtResultadoFatorial = findViewById(R.id.txtResultadoFatorial);

    }

    public void calcularFatorial(View view){
        int a = 1;
        int numeroVerificadoFatorial = Integer.parseInt(editVerificaFatorial.getText().toString());
        for (int j = 1; j<=numeroVerificadoFatorial; j++ ){
            a = a * j;
        }
            txtResultadoFatorial.setText("O fatorial é: " + a);
        }

}
