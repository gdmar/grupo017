package ar.edu.unju.fi.ejercicio20.principal;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio20.model.domain.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("Sebastián", LocalDate.of(1982, 12, 26));
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Edad: "+p.determinarCantidadAños()+" años.");
        System.out.println("Signo del zodiaco: "+p.determinarSignoZodiaco());
        System.out.println("Estación: "+p.determinarEstacion());
    }
}
