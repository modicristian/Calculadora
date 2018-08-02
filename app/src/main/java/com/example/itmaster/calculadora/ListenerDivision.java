package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerDivision implements View.OnClickListener
{
    private MainActivity contextdivision;

    public ListenerDivision(MainActivity contextdivision)
    {
        this.contextdivision = contextdivision;
    }

    @Override
    public void onClick(View view)
    {
        Intent resultado = new Intent(contextdivision, Resultado.class);
        Integer division = Integer.valueOf(contextdivision.getNumero1().getText().toString())/Integer.valueOf(contextdivision.getNumero2().getText().toString());
        resultado.putExtra("DIVISION",division);

        contextdivision.startActivity(resultado);

    }
}
