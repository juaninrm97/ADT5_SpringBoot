package es.studium.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Tripulacion {
    private String nombre;
    private String cargo;

    public Tripulacion() {
        this.nombre = "Manuel";
        this.cargo = "maquinista";
    }

    @Override
    public String toString() {
        return "Tripulacion [nombreTripulacion=" + nombre + ", cargo=" + cargo + "]";
    }
}

