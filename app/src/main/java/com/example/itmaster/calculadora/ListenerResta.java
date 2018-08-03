package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerResta implements View.OnClickListener
{
    private MainActivity contextresta;

    public ListenerResta(MainActivity contextresta)
    {
        this.contextresta = contextresta;
    }

    @Override
    public void onClick(View view)
    {
        Intent resultado = new Intent(contextresta, Resultado.class);
        Integer resta = Integer.valueOf(contextresta.getNumero1().getText().toString())-Integer.valueOf(contextresta.getNumero2().getText().toString());
        resultado.putExtra("RESULTADO",resta);

        contextresta.startActivity(resultado);
    }
}
