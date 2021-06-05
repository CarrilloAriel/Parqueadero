/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import parqueadero_proyecto.Vehiculo;

/**
 *
 * @author Dani
 */
public class NodoCola {
   
    private Vehiculo dato;
    private NodoCola anterior;
    private NodoCola siguiente;


    NodoCola(Vehiculo dato, NodoCola siguiente) {//constructor para cola
       this.dato = dato;
       this.siguiente = siguiente;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
