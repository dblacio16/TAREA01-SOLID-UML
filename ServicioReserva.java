import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ServicioReserva {

    private Notificador notificador;

    public ServicioReserva(Notificador notificador) {
        this.notificador = notificador;
    }

    public Reserva solicitarReserva(
            String idReserva,
            String idPago,
            Huesped huesped,
            Anfitrion anfitrion,
            Unidad unidad,
            Date fechaInicio,
            Date fechaFin,
            double depositoSeguridad) {

        // 1. Verificar disponibilidad
        if (!unidad.verificarDisponibilidad()) {
            informarNoDisponibilidad();
            return null;
        }

        // 2. Calcular costo total
        double total = calcularCostoTotal(
                unidad,
                fechaInicio,
                fechaFin,
                depositoSeguridad
        );

        System.out.println("Costo total: $" + total);

        // 3. Procesar pago
        Pago pago = new Pago(
                idPago,
                total,
                depositoSeguridad
        );

        boolean pagoAprobado = pago.procesarCobro();

        if (!pagoAprobado) {
            informarPagoRechazado(huesped);
            return null;
        }

        // 4. La unidad cambia a reservada
        unidad.actualizarEstado("RESERVADA");

        // 5. Crear la reserva
        Reserva reserva = new Reserva(
                idReserva,
                fechaInicio,
                fechaFin
        );

        reserva.confirmar();

        // 6. Notificar a ambas partes
        enviarConfirmacion(huesped, reserva);
        enviarConfirmacion(anfitrion, reserva);

        return reserva;
    }

    public double calcularCostoTotal(
            Unidad unidad,
            Date fechaInicio,
            Date fechaFin,
            double depositoSeguridad) {

        long diferencia = fechaFin.getTime() - fechaInicio.getTime();

        long noches = TimeUnit.MILLISECONDS.toDays(diferencia);

        if (noches < 1) {
            noches = 1;
        }

        return (unidad.precioPorNoche * noches)
                + depositoSeguridad;
    }

    public void enviarConfirmacion(
            Usuario usuario,
            Reserva reserva) {

        notificador.enviarMensaje(
                usuario,
                "Reserva " + reserva.id + " confirmada."
        );
    }

    public void informarPagoRechazado(Huesped huesped) {

        notificador.enviarMensaje(
                huesped,
                "No fue posible procesar el pago."
        );
    }

    public void informarNoDisponibilidad() {
        System.out.println("La unidad no está disponible.");
    }
}