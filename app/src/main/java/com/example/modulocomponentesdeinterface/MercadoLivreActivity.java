package com.example.modulocomponentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MercadoLivreActivity extends AppCompatActivity {

    private Button acao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado_livre);

       acao = findViewById(R.id.btnAcao);

        acao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MercadoLivreActivity.this, IFoodActivity.class);
                startActivity(i);
            }
        });
    }
}