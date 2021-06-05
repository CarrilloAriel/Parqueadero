package parqueadero_proyecto;

public class Tarifa {

    private String tiempo;

    private double valor;

    public Tarifa(String tiempo, double valor) {
        this.tiempo = tiempo;
        this.valor = valor;
    }
    
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tiempo:" + tiempo+" valor: $" + valor;
    }

    
    
    
 
 
}
