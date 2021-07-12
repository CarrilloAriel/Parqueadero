package parqueadero_proyecto;

import java.util.Date;

public class Recibo {

    private String horaDeSalida;
    private String horaEntrada;
    private String fecha;
    private String placa;
    private String nombre;
    private String apellido;
    private String tipoVehiculo;
    private double total;

    public Recibo(String horaDeSalida, String horaEntrada, String fecha, String placa, String nombre, String apellido, String tipoVehiculo, double total) {
        this.horaDeSalida = horaDeSalida;
        this.horaEntrada = horaEntrada;
        this.fecha = fecha;
        this.placa = placa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoVehiculo = tipoVehiculo;
        this.total = total;
    }

   
    public Recibo(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    
    
}
