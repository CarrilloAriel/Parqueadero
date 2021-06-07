/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import jdk.nashorn.internal.ir.BreakNode;
import parqueadero_proyecto.Parqueadero;
import parqueadero_proyecto.Vehiculo;



/**
 *
 * @author Dani
 */
public class Lista {
    private NodoLista inicio;
    private NodoLista fin;
    
    public Lista(){
        inicio=fin=null;
    }
    public boolean esVacia(){
        return inicio==null&& fin==null;
    }
    
    public void insertarInicio(Parqueadero dato){
        //dato,anterior,siguiente
        //...,null,inicio
        NodoLista nuevo = new NodoLista(dato,null,inicio);
        
        if (esVacia()){
            inicio=fin=nuevo;//aqui se setea el fin :)
        }else{
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
              
    }
    public void insertarFin(Parqueadero dato){
        NodoLista nuevo = new NodoLista(dato,fin,null);
        if(esVacia()){
            inicio=fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void imprimir(){
        if(esVacia()){
            System.out.println("No hay elementos");
        }
        else{
            NodoLista aux = inicio;
            while(aux!=null){
                System.out.println(aux.getDato().getCarro()+" Esta en "+aux.getDato().getNumeroLugar()+" parqueadero");
                aux = aux.getSiguiente();
            }
        }
    }
    
    
    /*
    AGREGAR ES VACIA PARA PARQUEADERO Y SABER SI TIENE CARRO
    */
    
    
    
    public Parqueadero eliminarFin() throws Exception{
        if(esVacia()){
            throw new Exception("No hay elementos");
        }else if(inicio==fin){
            NodoLista aux = fin;
            inicio=fin=null;
            return aux.getDato();
        }else{
            NodoLista aux = fin;
            fin.getAnterior().setSiguiente(null);//desconexion izquierda a derecha
            fin = fin.getAnterior();//desconexion derecha izquierda
            aux.setAnterior(null);//se utiliza aux porque fin ya no existe
            return aux.getDato();//el aux no se ha modificado nunca!!
            
        }
    }
    public boolean eliminar(String ip){
        if(esVacia()){
            System.out.println("No hay elementos");
            return false;
        }else{
            if(inicio==fin && inicio.getDato().getNumeroLugar().compareTo(ip)==0){
                inicio=fin=null;
                return true;
            }else if(inicio.getDato().getNumeroLugar().compareTo(ip)==0){
                NodoLista aux = inicio;                
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);//porque ese inicio ya no existe
                inicio.setAnterior(null);
                return true;
            }else{
                NodoLista aux=inicio;
                while(aux!=null && aux.getDato().getNumeroLugar().compareTo(ip)!=0){//sale cuando haya coincidencia
                    aux = aux.getSiguiente();
                }
                if(aux==null){
                    System.out.println("No hay la direccion "+ip);
                    return false;
                }else{
                    
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    if(aux!=fin){//porque si es getSiguiente es null
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                        aux.setSiguiente(null);
                    }else{
                        fin = fin.getAnterior();
                    }
                    aux.setAnterior(null);
                    return true;
                    
                }
            }
        }
        
    }
    public int contar(){
        int cont=0;
        NodoLista aux=inicio;
        while(aux!=null){
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }
    
    public Parqueadero valorIndice(int indice){
        int cont=0;
        NodoLista aux=inicio;
        while(cont<indice){
            
            cont++;
            aux=aux.getSiguiente();
            
        }
        return aux.getDato();
    }
    
    public boolean parquear(Vehiculo dato){
        
        NodoLista aux = inicio;
        while(aux!=null){
            if(aux.getDato().getCarro()==null){
                aux.getDato().setCarro(dato);
                break;
            }
            aux = aux.getSiguiente();
        }
        
        
        return true;
    }
    public boolean desparquear(String placa){
        
        NodoLista aux = inicio;
        
            while(aux!=null && aux.getDato().getCarro()!=null){
                if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                    aux.getDato().setCarro(null);
                    return true;                
                }
                aux = aux.getSiguiente();
            
            }
        System.out.println("ESE CARRO NO ESTA PARQUEADO");            
        
        return false;
    }
    public int contarLugaresDisponibles(){
        NodoLista aux = inicio;
        int cont=0;
        while(aux!=null){
            if(aux.getDato().getCarro()==null){
                cont++;
            }
            aux = aux.getSiguiente();
        }
        return cont;
    }
    public int contarPlazasOcupasas(){
        return contar()-contarLugaresDisponibles();
    }
    public boolean hayDisponible(){
        
        NodoLista aux = inicio;        
        while(aux!=null){
            if(aux.getDato().getCarro()==null){                
                return true;                
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    public boolean verLugaresDisponibles(){
        NodoLista aux = inicio;
        boolean x= false;      
        while(aux!=null){
            if(aux.getDato().getCarro()==null){
                System.out.println(aux.getDato().getNumeroLugar()+" esta disponible");   
                x=true;
            }            
            aux = aux.getSiguiente();
        }
        return x;
    }
}
