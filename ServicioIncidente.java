public class ServicioIncidente {

    private Notificador notificador;

    public ServicioIncidente(Notificador notificador) {
        this.notificador = notificador;
    }

    public Incidente reportarIncidente(
            String id,
            String descripcion,
            Usuario quienReporta,
            Usuario contraparte) {

        // Crear incidente
        Incidente incidente = new Incidente(
                id,
                descripcion
        );

        incidente.actualizarEstado("ABIERTO");

        // Notificar a la contraparte
        notificador.enviarMensaje(
                contraparte,
                "Se ha reportado un nuevo incidente: "
                        + incidente.id
        );

        return incidente;
    }

    public void proponerSolucion(
            Incidente incidente,
            Usuario contraparte,
            String solucion) {

        incidente.registrarSolucion(solucion);

        notificador.enviarMensaje(
                contraparte,
                "Se ha propuesto una solución: " + solucion
        );
    }

    public void aceptarSolucion(Incidente incidente) {

        incidente.actualizarEstado("RESUELTO");

        System.out.println(
                "La solución fue aceptada. Incidente resuelto."
        );
    }

    public void gestionarSinAcuerdo(
            Incidente incidente,
            Moderador moderador,
            SoporteLegal soporteLegal,
            boolean moderadorPuedeResolver) {

        // Escalamiento al moderador
        escalarAModerador(incidente, moderador);

        if (moderadorPuedeResolver) {

            String resolucion = moderador.emitirFallo();

            incidente.registrarResolucion(resolucion);

        } else {

            // Si el moderador no puede resolverlo,
            // escala a soporte legal
            escalarASoporteLegal(
                    incidente,
                    soporteLegal
            );

            String resolucion =
                    soporteLegal.dictaminarSolucion();

            incidente.registrarResolucion(resolucion);
        }

        // En ambos caminos termina cerrado
        incidente.actualizarEstado("CERRADO");
    }

    public void escalarAModerador(
            Incidente incidente,
            Moderador moderador) {

        incidente.escalarAModerador();

        moderador.revisarIncidente();
    }

    public void escalarASoporteLegal(
            Incidente incidente,
            SoporteLegal soporteLegal) {

        incidente.escalarASoporteLegal();

        soporteLegal.revisarIncidente();
    }
}