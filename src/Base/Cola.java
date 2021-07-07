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
                throw new Exception("NO SE PUEDE ATENDER Cola vacia");
            }
            NodoCola aux = inicio;            
            inicio = inicio.getSiguiente();//toma el valor que apunta al siguiente
            if(inicio==null){
                fin=inicio=null;
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
    public String verCarrosEspera(){
        NodoCola aux = inicio;
        String s= "";      
        while(aux!=null){
             
            s=s+aux.getDato().getPlaca()+"\n";
                      
            aux = aux.getSiguiente();
        }
        return s;
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
    
    
    public boolean buscarPlacaCola(String placa){
        NodoCola aux = inicio;
        boolean flag=false;
            while(aux!=null ){
                if( aux.getDato().getPlaca().compareToIgnoreCase(placa)==0){
                    flag=true;
                    return flag;
                }
                aux = aux.getSiguiente();
            }
        return flag;
    }
    
    
}
