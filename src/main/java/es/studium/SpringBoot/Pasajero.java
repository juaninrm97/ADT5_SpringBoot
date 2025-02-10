package es.studium.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Pasajero {
    private String nombre;
    private int asiento;

    public Pasajero() {
        this.nombre = "María José";
        this.asiento = 14;
    }

    @Override
    public String toString() {
        return "Pasajero [nombrePasajero=" + nombre + ", asientoPasajero=" + asiento + "]";
    }
}
