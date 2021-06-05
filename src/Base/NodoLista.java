/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import parqueadero_proyecto.Parqueadero;



/**
 *
 * @author Dani
 */
public class NodoLista {
   
    private Parqueadero dato;
    private NodoLista anterior;
    private NodoLista siguiente;

    

    public NodoLista(Parqueadero dato, NodoLista anterior, NodoLista siguiente) {//constructor para lista de parqueaderos
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }


    public Parqueadero getDato() {
        return dato;
    }

    public void setDato(Parqueadero dato) {
        this.dato = dato;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
