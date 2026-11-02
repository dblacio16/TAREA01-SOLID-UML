public class Incidente {

    public String id;
    public String descripcion;
    public String estado;

    public Incidente(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "ABIERTO";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void registrarSolucion(String solucion) {
        System.out.println("Solución propuesta: " + solucion);
    }

    public void registrarResolucion(String resolucion) {
        System.out.println("Resolución registrada: " + resolucion);
    }

    public void escalarAModerador() {
        System.out.println("Incidente escalado al moderador.");
    }

    public void escalarASoporteLegal() {
        System.out.println("Incidente escalado a soporte legal.");
    }
}