package ar.edu.unju.fi.ejercicio08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombre;
        int edad = 0;
        Scanner entrada = new Scanner(System.in);
        boolean edadValido = false;

        System.out.println("--------------- Datos de la Persona ---------------");
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.next();
        while(!edadValido) {
            try {
                System.out.print("Ingrese edad: ");
                edad = entrada.nextInt();
                edadValido = true;
            } catch (Exception e) {
                System.out.println("Edad ingresado No valido");
                entrada.next();
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad <18) {
            System.out.println("Es menor de edad.");
            
        } else {
            System.out.println("Es mayor de edad.");
        }
        entrada.close();
    }
}
