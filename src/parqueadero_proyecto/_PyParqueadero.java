/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero_proyecto;

import Base.Cola;
import Base.Lista;
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
        
       Parqueaderos.insertarInicio(new Parqueadero("A1",null));
       Parqueaderos.insertarInicio(new Parqueadero("A2",null));
       Parqueaderos.insertarInicio(new Parqueadero("A3",null));
       Parqueaderos.insertarInicio(new Parqueadero("A4",null));
       Parqueaderos.insertarInicio(new Parqueadero("A5",null));
       
       ColaDeCarros.insertar(new Vehiculo("1", "2023", new Persona("Pepe", "1")));
       ColaDeCarros.insertar(new Vehiculo("2", "2023", new Persona("Pepe", "1")));
       ColaDeCarros.insertar(new Vehiculo("3", "2023", new Persona("Pepe", "1")));
       
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
       }
       while(!salir){
       System.out.println("1.Ingresar al parqueadero\n"                
                + "2.Ver numero de lugares lisponibles\n"
                + "3.Ver que lugar esta disponible\n"
                + "4.Ver longitud de la cola\n"
                + "5.Agregar parqueaderos\n"
                + "6.Quitar parqueaderos");
        
           System.out.println("Ingrese una opcion");
           int n = sc.nextInt();
        switch(n){
                case 1:
                    ColaDeCarros.insertar(new Vehiculo("1", "2023", new Persona("Pepe", "1")));
                    ColaDeCarros.insertar(new Vehiculo("2", "2023", new Persona("Pepe", "2")));
                    ColaDeCarros.insertar(new Vehiculo("3", "2023", new Persona("Pepe", "3")));
                    
                    ColaDeCarros.insertar(new Vehiculo("4", "2023", new Persona("Pepe", "4")));
                    ColaDeCarros.insertar(new Vehiculo("4", "2023", new Persona("Pepe", "4")));
                    ColaDeCarros.insertar(new Vehiculo("4", "2023", new Persona("Pepe", "4")));
                break;
                case 2:
                    System.out.println(Parqueaderos.contarLugaresDisponibles());
                break;
                case 3:
                    Parqueaderos.verLugaresDisponibles();
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
        }
        
        
        
        //COLA DE ESPERA
        
        
        
        ColaDeCarros.atender();
        
        ////PRIMERO ENCOLAR PARQUEADEROS
       }
        
        
    }
    
}
