package es.studium.SpringBoot;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Viaje {
    private String nombre;
    private String origen;
    private String destino;
    private Tren tren;
    private List<Pasajero> pasajeros;

    public Viaje(Tren tren, Pasajero pasajero) {
        this.nombre = "Excursión por Ávila y Segovia";
        this.origen = "Sevilla";
        this.destino = "Ávila";
        this.tren = tren;
        this.pasajeros = List.of(pasajero);
    }

    @Override
    public String toString() {
        return "El bean Viaje [nombreViaje=" + nombre + ", origen=" + origen + ", destino=" + destino + ", tren=" + tren + ", pasajeros=" + pasajeros + "]";
    }
}
