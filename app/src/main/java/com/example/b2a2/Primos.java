package com.example.b2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Primos extends AppCompatActivity {
    Button botaoVerificarPrimos;
    EditText editVerificaPrimo;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primos);

        botaoVerificarPrimos = findViewById(R.id.btn_VerificarPrimos);
        editVerificaPrimo = findViewById(R.id.editVerificarPrimos);
        txtResultado = findViewById(R.id.txtResultadoPrimo);

    }
    public void verificar(View view){
        double numeroVeriicado = Double.parseDouble(editVerificaPrimo.getText().toString());
        double a = 0;
        for (int j = 2; j < numeroVeriicado; j++){
            if (numeroVeriicado % j == 0) {
                txtResultado.setText("Não é Primo");
                a = 1;
            } else if (numeroVeriicado == 2 || numeroVeriicado == 0){
                txtResultado.setText("Não é Primo");
                a = 1;
            }
        }
        if (a == 0){
            txtResultado.setText("É Primo");
        }

    }
}