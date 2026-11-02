public class Moderador extends Usuario {

    public void revisarIncidente() {
        System.out.println("El moderador está revisando el incidente.");
    }

    public String emitirFallo() {
        return "Resolución emitida por el moderador";
    }
}