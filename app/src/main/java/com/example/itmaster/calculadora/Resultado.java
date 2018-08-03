package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity
{
    private TextView resultado;
    private Button volver;
    private ListenerVolver listenerVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        resultado = findViewById(R.id.resultado);
        volver = findViewById(R.id.volver);

        String solucion = String.valueOf(b.getInt("RESULTADO"));

        resultado.setText(solucion);

        listenerVolver = new ListenerVolver(this);
        volver.setOnClickListener(listenerVolver);
    }


}
