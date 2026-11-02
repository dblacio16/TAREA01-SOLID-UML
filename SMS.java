public class SMS implements Notificador {

    @Override
    public void enviarMensaje(Usuario u, String mensaje) {
        System.out.println("[NOTIFICACIÓN SMS] Para: " + u.getNombre() + " | Mensaje: " + mensaje);
    }
}