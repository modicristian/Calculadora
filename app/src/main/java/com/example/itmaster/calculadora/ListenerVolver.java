package com.example.itmaster.calculadora;

import android.view.View;

public class ListenerVolver implements View.OnClickListener
{
    private Resultado contextVolver;

    public ListenerVolver(Resultado contextVolver)
    {
        this.contextVolver = contextVolver;
    }

    @Override
    public void onClick(View view)
    {
        contextVolver.onBackPressed();
    }
}
