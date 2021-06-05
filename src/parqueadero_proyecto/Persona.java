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
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFecha() {
        return null;
    }

    public void setFecha(Date fecha) {
       
    }

    public Timer getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(Timer HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public void setTarifa(String[] Tarifa) {
    }

    public Tarifa[] getTarifa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", vehiculo=" + vehiculo + ", HoraEntrada=" + HoraEntrada + '}';
    }

    
}
