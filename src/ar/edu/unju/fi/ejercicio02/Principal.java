package ar.edu.unju.fi.ejercicio02;

public class Principal {
    public static void main(String[] args) {
        String materia = "Programación Visual";
        String dia_teoria = "Miercoles";
        String dia_practica = "Lunes";
        int cantidad_horas = 6;
        int anio_cursada = 2023;
        String profesor_teoria = "Ariel Vega";
        String profesor_practica1 = "Carolina Apaza";
        String profesor_practica2 = "Juan Carlos Rodriguez";

        System.out.println("La materia que curso: " + materia);
        System.out.println("Los días que se dicta la materia: " + dia_practica + ", " + dia_teoria);
        System.out.println("Cantidad de horas semanales: " + cantidad_horas);
        System.out.println("Año de cursada: " + anio_cursada);
        System.out.println("Profesores: " + profesor_teoria + ", " + profesor_practica1  +", " + profesor_practica2);
        System.out.println("El profesor que dicta la teoria: " + profesor_teoria);
        System.out.println("Los profesores que dictan la práctica: " + profesor_practica1 + ", " + profesor_practica2);

    }
}
