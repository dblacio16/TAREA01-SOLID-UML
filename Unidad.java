public class Unidad {
    public String id;
    public String tipo;
    public String estado;
    public double precioPorNoche;

    public boolean verificarDisponibilidad() {
        return "disponible".equalsIgnoreCase(this.estado);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
