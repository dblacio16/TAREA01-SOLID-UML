public class Anfitrion extends Usuario {

    public Anfitrion(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void gestionarPropiedad() {
        System.out.println("El anfitrión está gestionando la propiedad.");
    }

    public void atenderIncidente() {
        System.out.println("El anfitrión está atendiendo el incidente.");
    }
}