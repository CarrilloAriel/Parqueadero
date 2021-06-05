package parqueadero_proyecto;

public class Tarifa {

    private String tiempo;

    private String valor;

    public Tarifa(String tiempo, String valor) {
        this.tiempo = tiempo;
        this.valor = valor;
    }
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tiempo: " + tiempo + " valor: " + valor;
    }
    

    
    
 
}
