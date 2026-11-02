public class Correo implements Notificador {

    @Override
    public void enviarMensaje(Usuario u, String mensaje) {
        System.out.println("[NOTIFICACIÓN CORREO] Para: " + u.getCorreo() + " | Mensaje: " + mensaje);
    }
}