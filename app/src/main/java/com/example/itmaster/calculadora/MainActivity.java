package com.example.itmaster.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText numero1 , numero2;
    private Button suma, resta, division, multiplicacion;
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerDivision listenerDivision;
    private ListenerMultiplicacion listenerMultiplicacion;

    public EditText getNumero1()
    {
        return numero1;
    }

    public EditText getNumero2()
    {
        return numero2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        division = findViewById(R.id.division);
        multiplicacion = findViewById(R.id.multiplicacion);

        listenerSuma = new ListenerSuma();
        listenerResta = new ListenerResta();
        listenerDivision = new ListenerDivision();
        listenerMultiplicacion = new ListenerMultiplicacion();

        suma.setOnClickListener(listenerSuma);
        resta.setOnClickListener(listenerResta);
        division.setOnClickListener(listenerDivision);
        multiplicacion.setOnClickListener(listenerMultiplicacion);



    }

}
