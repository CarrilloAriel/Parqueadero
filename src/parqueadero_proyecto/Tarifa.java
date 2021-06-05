package parqueadero_proyecto;

public class Tarifa {

    private int tiempo;

    private int valor;

    public Tarifa(int tiempo, int valor) {
        this.tiempo = tiempo;
        this.valor = valor;
    }
    
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "tiempo=" + tiempo + ", valor=" + valor + '}';
    }

    
    
    
 
 
}
