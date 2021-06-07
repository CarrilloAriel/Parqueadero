package parqueadero_proyecto;

public class Vehiculo {

    private String placa;
    private String tipo;    
    private Timer horaEntrada;
    private Timer horaSalida;
    
    public Vehiculo(){
        
    }
    public Vehiculo(String placa, String tipo,Persona persona) {        
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
       return placa;
    }

    public void setPlaca(String placa) {
        this.placa=placa;
               
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    public Timer getHoraEntrada() {
        return horaEntrada;
    }

    public Timer getHoraSalida() {
        return horaSalida;
    }

    public void setHoraEntrada(Timer horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(Timer horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipo=" + tipo;
    }
    

   
    
    
}
