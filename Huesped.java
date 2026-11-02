import java.util.ArrayList;
import java.util.List;

public class Huesped extends Usuario {

    public Huesped(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public List<Object> buscarPropiedad() {
        System.out.println(nombre + " está buscando propiedades...");
        return new ArrayList<>();
    }

    public Object reservarUnidad() {
        System.out.println(nombre + " está realizando una reserva...");
        return null;
    }
}