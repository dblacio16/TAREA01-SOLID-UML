public class SoporteLegal extends Usuario {

    public SoporteLegal(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void revisarIncidente() {
        System.out.println("Soporte legal está revisando el incidente.");
    }

    public String dictaminarSolucion() {
        return "Resolución definitiva de soporte legal";
    }
}