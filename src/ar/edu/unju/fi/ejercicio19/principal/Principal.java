package ar.edu.unju.fi.ejercicio19.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio19.model.domain.Empleado;

public class Principal {
    public static void main(String[] args) {
        String nombre;
        LocalDate fechaIngreso;
        int legajo;
        String email;
        int horasTrabajo;

        // formato de fecha a convertir.
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre de Empleado: ");
            nombre = entrada.next();
            System.out.print("Ingrese fecha de ingreso (dd/MM/yyyy): ");
            // convierte la fecha ingresada como String a LocalDate.
            fechaIngreso = LocalDate.parse(entrada.next(),formatoFecha);
            System.out.print("Ingrese legajo: ");
            legajo = entrada.nextInt();
            System.out.print("Ingrese el email: ");
            email = entrada.next();
            System.out.print("Ingrese horas de trabajo: ");
            horasTrabajo = entrada.nextInt();
            System.out.println("---------------------------------------------------------");
            Empleado empleado = new Empleado(nombre, fechaIngreso, legajo, email, horasTrabajo);
            System.out.println(empleado.toString());
        }
        entrada.close();
    }
}
