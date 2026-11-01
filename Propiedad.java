import java.util.List;
import java.util.ArrayList;

public class Propiedad {
    public String id;
    public String ubicacion;
    
    public List<Unidad> unidades = new ArrayList<>();
    public List<ReglaPropiedad> reglas = new ArrayList<>();

    public void agregarUnidad(Unidad u) {
        this.unidades.add(u);
    }

    public void agregarRegla(ReglaPropiedad r) {
        this.reglas.add(r);
    }
}
