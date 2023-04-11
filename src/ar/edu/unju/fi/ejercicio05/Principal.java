package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        byte radio;
        Scanner entrada = new Scanner(System.in);
        double area_circulo;

        System.out.println("------------------------------------------------------------");
        System.out.println("    Ingrese el radio (<=127)");
        try {
            System.out.print("Radio: ");
            radio = entrada.nextByte();
            area_circulo = Math.PI * Math.pow(radio, 2);
            System.out.println("Area del circulo de radio " + radio + " es: " + area_circulo);

        } catch (Exception e) {
            System.out.println("Error al ingresar radio");            
        }
        entrada.close();
    }
}
