package ar.edu.unju.fi.ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");        
        try {
            numero = entrada.nextInt();
            if (numero % 2 != 0) {
                System.out.println(numero * 2);
            } else {
                System.out.println(numero * 3);
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor Ingresado No Válido.");
        }
        entrada.close();
    }
}
