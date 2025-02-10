package es.studium.SpringBoot;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Tren {
    private String modelo;
    private int numeroAsientos;
    private List<Tripulacion> tripulacion;

    public Tren(Tripulacion tripulante) {
        this.modelo = "Talgo 747";
        this.numeroAsientos = 100;
        this.tripulacion = List.of(tripulante);
    }

    @Override
    public String toString() {
        return "Tren [modelo=" + modelo + ", numeroAsientosTren=" + numeroAsientos + ", tripulacion=" + tripulacion + "]";
    }
}
