package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        String resp = "";

        while (!resp.equalsIgnoreCase("n")) {
            System.out.print("Ingrese un número entre 1 y 9: ");
            try {
                numero = entrada.nextInt();
                if (numero >= 1 && numero <= 9) {
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(numero + " X " + i + " = " + numero * i);
                    }
                } else {
                    System.out.println("Número fuera de rango [1 ; 9]");
                }
                System.out.println("¿Desea generar otra tabla? S/N");
                resp = entrada.next().toLowerCase();
            } catch (Exception e) {
                System.out.println("Valor ingresado No válido");
                entrada.next();
            }
        }
        entrada.close();

    }
}
