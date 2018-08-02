package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerSuma implements View.OnClickListener
{
    private MainActivity contextsuma;
    
    public ListenerSuma(MainActivity contextsuma)
    {
        this.contextsuma = contextsuma;
    }

    @Override
    public void onClick(View view)
    {
        Intent resultado = new Intent(contextsuma, Resultado.class);
        Integer suma = Integer.valueOf(contextsuma.getNumero1().getText().toString()) + Integer.valueOf(contextsuma.getNumero2().getText().toString());
        resultado.putExtra("SUMA",suma);

        contextsuma.startActivity(resultado);
    }
}
