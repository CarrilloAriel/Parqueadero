package parqueadero_proyecto;
import Base.*;
import java.util.Date;
public class Persona {

    private String Nombre;

    private String Apellido;    

    private Vehiculo vehiculo;

    

    private Timer HoraEntrada;

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setNombre(String Nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setApellido(String Apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date getFecha() {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
    }

    public void setFecha(Date fecha) {
        
    }

    public Timer getHoraEntrada() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHoraEntrada(Timer HoraEntrada) {
    }

    public void setTarifa(String[] Tarifa) {
    }

    public Tarifa[] getTarifa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
