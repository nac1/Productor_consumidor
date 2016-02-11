package com.example.upam.productor_consumidor;

import android.util.Log;

/**
 * Created by upam on 11/02/16.
 */
public class Productor extends  Thread {
    private Contenedor contenedor;
    String tag="msn";

    public Productor(Contenedor c){
        contenedor=c;

    }

    public void run(){

        for(int i=0;i<10;i++)
        {
            contenedor.put(i);
            Log.d(tag,"poductor put:"+i);

            try {
                sleep((int)(Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
