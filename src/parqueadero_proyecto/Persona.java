package parqueadero_proyecto;
import Base.*;
import java.util.Date;
import java.util.Calendar;
public class Persona {

    private String Nombre;
    private String Apellido;   
   
    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public Persona(){
        
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
 @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }
  

}
