package com.example.upam.productor_consumidor;

import android.util.Log;

/**
 * Created by upam on 11/02/16.
 */
public class Consumidor extends  Thread {
    private Contenedor contenedor;
    String tag="msn";
    public Consumidor(Contenedor c){
        contenedor=c;
    }
    public void run()
    {
        int value=0;

        for(int i=0;i<100; i++)
        {
            value=contenedor.get();
            Log.d(tag,"Consumidor get:"+value);
        }


    }
}
