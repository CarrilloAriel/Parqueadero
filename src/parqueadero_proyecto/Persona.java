package parqueadero_proyecto;
import Base.*;
import java.util.Date;
import java.util.Calendar;
public class Persona {

    private String Nombre;
    private String Apellido;   
    private Vehiculo vehiculo;
    private String HoraEntrada;
    private Date Fecha;

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public Persona(){
        
    }
    /*public Persona(String Nombre, String Apellido, String HoraEntrada, Date Fecha) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.HoraEntrada = HoraEntrada;
        this.Fecha = Fecha;
    }*/
    

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

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", vehiculo=" + vehiculo + ", HoraEntrada=" + HoraEntrada + "Fecha "+Fecha;
    }

    
}
