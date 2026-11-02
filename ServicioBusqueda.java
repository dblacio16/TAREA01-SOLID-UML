import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicioBusqueda {

    public List<Object> buscarAlojamiento(String ubicacion, Date fechaInicio, Date fechaFin) {
        System.out.println("Buscando alojamientos en: " + ubicacion);
        return new ArrayList<>();
    }

    public void agregarFiltros(double precioMin, double precioMax, List<String> servicios) {
        System.out.println("Filtros aplicados - Precio: $" + precioMin + " - $" + precioMax + " | Servicios: " + servicios);
    }

    public List<Object> consultarDisponibles(Object criterios) {
        System.out.println("Consultando unidades disponibles según criterios.");
        return new ArrayList<>();
    }

    public Object obtenerDetalles(String idUnidad) {
        System.out.println("Obteniendo detalles de la unidad ID: " + idUnidad);
        return null;
    }
}