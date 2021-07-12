/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.text.ParseException;
import java.util.Date;
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
    public boolean eliminar(String num){
        if(esVacia()){
            System.out.println("No hay elementos");
            return false;
        }else{
            if(inicio==fin && inicio.getDato().getNumeroLugar().compareTo(num)==0){
                inicio=fin=null;
                return true;
            }else if(inicio.getDato().getNumeroLugar().compareTo(num)==0){
                NodoLista aux = inicio;                
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);//porque ese inicio ya no existe
                inicio.setAnterior(null);
                return true;
            }else{
                NodoLista aux=inicio;
                while(aux!=null && aux.getDato().getCarro().getPlaca().compareTo(num)!=0){//sale cuando haya coincidencia
                    aux = aux.getSiguiente();
                }
                if(aux==null){
                    System.out.println("El lugar "+num+" no existe");
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
        
            while(aux!=null){
                if(aux.getDato().getCarro()!=null){
                    
                    if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                        aux.getDato().setCarro(null);
                        return true;             
                    }
                }
                aux = aux.getSiguiente();
            
            }
        System.out.println("ESE CARRO NO ESTA PARQUEADO");            
        
        return false;
    }
    public Date buscarHoraEntrada(String placa){
        Date hora=null;
        NodoLista aux = inicio;
        
            while(aux!=null ){
                if( aux.getDato().getCarro()!=null){
                    if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){

                        hora=aux.getDato().getCarro().getHoraEntrada();

                        //minutos=(int) ((horaSalida.getTime()-aux.getDato().getCarro().getPersona().getHoraEntrada().getTime())/60000);
                    }
                }
                aux = aux.getSiguiente();
            }
        return hora;
        //minutos=(horaSalida.getTime()-horaSalida.getTime())/60000;
        
    }
    public int calcularTiempo(String placa,Date horaSalida){
        NodoLista aux = inicio;
        int minutos=0;
            while(aux !=null){
                if(aux.getDato().getCarro()!=null){
                    if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                                       
                       minutos=(int) ((horaSalida.getTime()-aux.getDato().getCarro().getHoraEntrada().getTime())/60000);
                    }  
                }
                
                aux = aux.getSiguiente();
            
            }
        return minutos;
        
    }
    public double valorPagar(String placa, int minutos){
       double valor=0.0;
       NodoLista aux = inicio;
       while(aux!=null){
            if(aux.getDato().getCarro()!=null){
                if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                                       
                   if(aux.getDato().getCarro().getTipo().compareToIgnoreCase("Automovil")==0){
                       valor=minutos*0.50;
                   }else{
                       valor=minutos*0.25;
                   }
                }
                
            }
              
            aux = aux.getSiguiente();
            
        }
       
       
       return valor; 
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
    public String verLugaresDisponibles(){
        NodoLista aux = inicio;
        String s= "";      
        while(aux!=null){
            if(aux.getDato().getCarro()==null){  
                s=s+aux.getDato().getNumeroLugar()+"\n";
            }            
            aux = aux.getSiguiente();
        }
        return s;
    }
    public boolean buscarPlacaF(String placa){
        NodoLista aux = inicio;
        boolean flag=false;
            while(aux!=null ){
                if( aux.getDato().getCarro()!=null){
                    if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                       flag=true;
                       return flag;
                    }
                }
                aux = aux.getSiguiente();
            }
        return flag;
    }
    public Vehiculo buscarPlaca(String placa){
        NodoLista aux = inicio;
        Vehiculo carroEncontrado=null;
   
            while(aux!=null ){
                if( aux.getDato().getCarro()!=null){
                    if(placa.compareTo(aux.getDato().getCarro().getPlaca())==0){
                      
                       carroEncontrado=aux.getDato().getCarro();
                    }
                }
                aux = aux.getSiguiente();
            }
        return carroEncontrado;
    }
}
