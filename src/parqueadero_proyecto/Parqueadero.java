package parqueadero_proyecto;
import Base.*;
public class Parqueadero {
//hola
    private String NumeroLugar;
    private Vehiculo carro;

    
    
    public Parqueadero(String NumeroLugar,Vehiculo carro) {
        this.NumeroLugar = NumeroLugar;
        this.carro = carro;
    }

    public String getNumeroLugar() {
        return NumeroLugar;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setNumeroLugar(String NumeroLugar) {
        this.NumeroLugar = NumeroLugar;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }
    
    
    
    public NodoCola parquearCarro(NodoCola nodoInicio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void quitarCarro() {
    }

    public boolean tieneLugarDisponible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String buscarCarro(String placa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimir() {
    }
}
