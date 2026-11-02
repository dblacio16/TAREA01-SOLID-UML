public class Pago {

    public String id;
    public double monto;
    public double depositoSeguridad;
    public String estado;

    public Pago(String id, double monto, double depositoSeguridad) {
        this.id = id;
        this.monto = monto;
        this.depositoSeguridad = depositoSeguridad;
        this.estado = "PENDIENTE";
    }

    public boolean procesarCobro() {

        // Lógica mínima para el prototipo
        if (monto > 0) {
            estado = "APROBADO";
            System.out.println("Pago aprobado.");
            return true;
        }

        estado = "RECHAZADO";
        System.out.println("Pago rechazado.");
        return false;
    }
}