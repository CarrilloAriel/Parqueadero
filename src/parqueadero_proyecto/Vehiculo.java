package parqueadero_proyecto;

import java.util.Date;

public class Vehiculo {

    private String placa;
    private String tipo;   
    private Persona persona;
    private Date horaEntrada;

    public Vehiculo(String placa, String tipo,Date horaEntrada,Persona persona) {        
        this.placa = placa;
        this.tipo = tipo;
        this.horaEntrada=horaEntrada;
        this.persona=persona;
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
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
      public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipo=" + tipo+"Hora= "+getHoraEntrada();
    }

    

   
    
    
}
