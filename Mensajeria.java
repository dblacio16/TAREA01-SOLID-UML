public class Mensajeria implements Notificador {

    @Override
    public void enviarMensaje(Usuario u, String mensaje) {
        System.out.println("[NOTIFICACIÓN MENSAJERÍA APP] Para: " + u.getNombre() + " | Mensaje: " + mensaje);
    }
}