/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero_proyecto;

import Base.Cola;
import Base.Lista;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class _PyParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //INSERTAR PARQUEADEROS BASE
        boolean salir = false;
        Cola ColaDeCarros = new Cola();
        Scanner sc = new Scanner(System.in);
        Lista Parqueaderos = new Lista();
        List <Tarifa> tarifas = new ArrayList<>();
        tarifas.add(new Tarifa("Menos de 25",0.25));
        tarifas.add(new Tarifa("Entre 25 min y 1 hora",0.5));
        tarifas.add(new Tarifa("Entre 1 hora y 5 horas ",2.00));
        tarifas.add(new Tarifa("Más de 5 horas",7.00));
       Parqueaderos.insertarInicio(new Parqueadero("A1",null));
       Parqueaderos.insertarInicio(new Parqueadero("A2",null));
       Parqueaderos.insertarInicio(new Parqueadero("A3",null));
       Parqueaderos.insertarInicio(new Parqueadero("A4",null));
       Parqueaderos.insertarInicio(new Parqueadero("A5",null));
      /* 
       ColaDeCarros.insertar(new Vehiculo("1", "2023", new Persona("Pepe", "1")));
       ColaDeCarros.insertar(new Vehiculo("2", "2023", new Persona("Pepe", "1")));
       ColaDeCarros.insertar(new Vehiculo("3", "2023", new Persona("Pepe", "1")));
        //holaaaassss
        //System.out.println("Atendido"+ColaDeCarros.atender());
       if(Parqueaderos.hayDisponible()){
           Parqueaderos.imprimir();
           //ColaDeCarros.atender();
          // System.out.println(Parqueaderos.parquear(ColaDeCarros.atender()));
           Parqueaderos.parquear(ColaDeCarros.atender());
           Parqueaderos.parquear(ColaDeCarros.atender());
          Parqueaderos.imprimir();
           
       }else{
           //System.out.println("No hay lugares");
       }*/
       while(!salir){
           
       System.out.println("1.Ingresar al parqueadero y ver tarifas\n"
               + "2.Atender\n"                
                + "3.Ver numero de lugares lisponibles\n"
                + "4.Ver que lugar esta disponible\n"
                + "5.Ver longitud de la cola\n"
                + "6.Agregar parqueaderos\n"
                + "7.Quitar parqueaderos\n"
               + "8.Salir\n"
               + "9.Ver cola de carros\n"
               + "10.Desparquear");
        //u///////
           System.out.println("Ingrese una opcion");
           int n = sc.nextInt();
        switch(n){
                case 1:
                    
                    Iterator<Tarifa> it = tarifas.iterator();
                    
                    while(it.hasNext()){
                        Tarifa t1=it.next();
                        System.out.println(t1);
                        
                    }
                    ColaDeCarros.insertar(new Vehiculo("1", "2023", new Persona("Pepe", "1")));
                    ColaDeCarros.insertar(new Vehiculo("2", "2023", new Persona("Pepe", "2")));
                    ColaDeCarros.insertar(new Vehiculo("3", "2023", new Persona("Pepe", "3")));                    
                    ColaDeCarros.insertar(new Vehiculo("4", "2023", new Persona("Pepe", "4")));
                    ColaDeCarros.insertar(new Vehiculo("5", "2023", new Persona("Pepe", "4")));
                    ColaDeCarros.insertar(new Vehiculo("6", "2023", new Persona("Pepe", "4")));
                break;
                case 2:
                     if(Parqueaderos.hayDisponible() && ColaDeCarros.esVacia()==false){                      
                        Parqueaderos.parquear(ColaDeCarros.atender()); 
                         System.out.println("Se ha atendido un vehiculo");
                    }else{
                        System.out.println("No hay lugares para parquear");
                    }
                break;
                case 3:
                    System.out.println(Parqueaderos.contarLugaresDisponibles());                        
                    
                break;
                case 4:
                    if(Parqueaderos.verLugaresDisponibles()==false){
                        System.out.println("NO HAY LUGARES DISPONIBLES");
                    }
                break;
                case 5:
                    System.out.println(ColaDeCarros.contar());
                break;
                case 6:
                break;
                case 7:
                break;
                case 8:
                    salir = true;
                break;
                case 9:
                    ColaDeCarros.imprimir();
                break;
                case 10:
                    System.out.println(Parqueaderos.desparquear("1"));
                    //da error al entrar cuando no hay carros
                break;
                
        }
        
       }
        
        
    }
    
}
