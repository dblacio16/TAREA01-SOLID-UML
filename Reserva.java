import java.util.Date;

public class Reserva {

    public String id;
    public Date fechaInicio;
    public Date fechaFin;

    public Reserva(String id, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void confirmar() {
        System.out.println("Reserva confirmada.");
    }

    public void cancelar() {
        System.out.println("Reserva cancelada.");
    }
}