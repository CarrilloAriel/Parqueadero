//pregunta: por que no se sobreescribe el objeto(direccion de memoria cambia siempre?)
//o se va agregando informacion al mismo objeto
//crece en la memoria dinamica 

//se quedan en memoria porque son atributos
package Base;

import parqueadero_proyecto.Vehiculo;


public class Cola {
    //4
    private NodoCola inicio;
    private NodoCola fin;
    
    public Cola(){
        inicio = fin = null;        
    }    
    public void insertar(Vehiculo vehiculo) throws Exception{
        NodoCola Nuevo = new NodoCola(vehiculo, null);
        
        if(esVacia()){            
            inicio =fin= Nuevo;
        }else{
            fin.setSiguiente(Nuevo);//tiene el valor de memoria de siguiete            
            fin=Nuevo;
        }
    }
    //extrae al elemento
    public Vehiculo atender() throws Exception{
            if(esVacia()){
                throw new Exception("Cola vacia");
            }
            NodoCola aux = inicio;
            
            inicio = inicio.getSiguiente();//toma el valor que apunta al siguiente
            if(inicio==null){
                fin=null;
            }
            
            aux.setSiguiente(null);        
            return aux.getDato();              
    }
    
    public Vehiculo frente()throws Exception{
        if(esVacia()){
            throw new Exception("Cola vacia");
        }
        return inicio.getDato();
    }
    public boolean esVacia(){
        return inicio == null && fin ==null;
        //return true;
    }
    
    public void imprimir(){
        if(esVacia()){
            System.out.println("NO HAY ELEMENTOS");
        }else{
            NodoCola aux = inicio;
            while(aux!=null){
                System.out.println("ELEMENTOS: "+aux.getDato().toString());
                aux = aux.getSiguiente();//ASI ES COMO NOS MOVEMOS ENTRE LOS NODOS
            }
            
        }
        
    }
    public int contar(){
        if(esVacia()){
            return 0;
        }
        int cont=0;
        NodoCola aux = inicio;
        while(aux!=null){
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }
    
    public void busqueda(String placa){
        if(esVacia()){
            System.out.println("No hay elementos");
        }else{
            NodoCola aux = inicio;
            Cola coincidencia = new Cola();
            for(int i=0;i<contar();i++){
                if(placa.compareToIgnoreCase(aux.getDato().getPlaca())==0){
                   // coincidencia.insertar(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            if(coincidencia.esVacia()){
                System.out.println("Sin coincidencias en la busqueda");
            }else{
                System.out.println("COINCIDENCIAS ENCONTRADAS: ");
                coincidencia.imprimir();
            }
            
        }
    }
    
    
}
