package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity
{
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        resultado = findViewById(R.id.resultado);

        String solucion = b.getString("RESULTADO");

        resultado.setText(solucion);

    }
}
