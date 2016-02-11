package com.example.upam.productor_consumidor;

/**
 * Created by upam on 11/02/16.
 */
public class Contenedor {
   private  int i;
    public boolean hayDato=false;



    public synchronized void put(int i)
    {

        while(hayDato==true)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.i=i;
        hayDato=true;
        //notificar
        notifyAll();
    }


    public synchronized int get()
    {
        while(hayDato==false) {

      //esperar
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        hayDato=false;
        //notificar  que el dato ha sido consumido
        notifyAll();
        return this.i;

    }

}
