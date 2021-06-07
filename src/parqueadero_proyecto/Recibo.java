package parqueadero_proyecto;

public class Recibo {

    private Timer HoraDeSalida;
    private Timer HoraEntrada;
    private Vehiculo vehiculo;
    private double total;
    private Persona datosPersona;

    public void imprimirTicket() {
    }

    public String pagarRecibo(String placa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Timer getHoraDeSalida() {
        return HoraDeSalida;
    }

    public void setHoraDeSalida(Timer horaDeSalida) {
        this.HoraDeSalida = horaDeSalida;
    }

    public Timer getHoraEntrada() {
        return HoraEntrada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Persona getDatosPersona() {
        return datosPersona;
    }

    public String getRecibo() {
        return "";
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
