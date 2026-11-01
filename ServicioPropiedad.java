import java.util.List;
import java.util.ArrayList;

public class ServicioPropiedad {
    
    public void accederGestionPropiedades() {
        System.out.println("Cargando módulo de gestión de propiedades...");
    }
    
    public List<Propiedad> obtenerPropiedades(Anfitrion anfitrion) {
        // Simula la obtención de propiedades desde una base de datos
        return new ArrayList<>(); 
    }
    
    public void seleccionarPropiedad(String idPropiedad) {
        System.out.println("Propiedad " + idPropiedad + " seleccionada.");
    }
    
    public void modificarDatos(Object datos, Object reglas, String estadoUnidad) {
        System.out.println("Guardando modificaciones de la propiedad...");
    }
    
    public boolean validarDatos(Object datos, Object reglas, String estadoUnidad) {
        return true; // Lógica de validación
    }
}
