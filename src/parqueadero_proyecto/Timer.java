package parqueadero_proyecto;

public class Timer {

    private int Hora;

    private int minuto;

    private int segundo;

    public Timer() {
    }

    public int getHora() {
        return Hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int Hora) {
        this.Hora=Hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int setSegundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Timer{" + "Hora=" + Hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }

   
}
