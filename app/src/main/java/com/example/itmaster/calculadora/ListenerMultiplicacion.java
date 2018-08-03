package com.example.itmaster.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerMultiplicacion implements View.OnClickListener
{
    private MainActivity contextmultiplicacion;

    public ListenerMultiplicacion(MainActivity contextmultiplicacion)
    {
        this.contextmultiplicacion = contextmultiplicacion;
    }

    @Override
    public void onClick(View view)
    {
        Intent resultado = new Intent(contextmultiplicacion, Resultado.class);
        Integer multiplicacion = Integer.valueOf(contextmultiplicacion.getNumero1().getText().toString())*Integer.valueOf(contextmultiplicacion.getNumero2().getText().toString());
        resultado.putExtra("RESULTADO", multiplicacion);

        contextmultiplicacion.startActivity(resultado);

    }
}
