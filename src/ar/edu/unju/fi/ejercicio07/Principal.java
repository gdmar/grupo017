package ar.edu.unju.fi.ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero;
        double factorial;
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            factorial = 1;
            if (numero >= 0 && numero <=10){
                if (numero != 0){
                    for (int i = numero; i > 0; i--) {
                        factorial *= i;
                    }
                }
                System.out.println("Factorial de " + numero +": " + factorial);
            } else {
                System.out.println("Número fuera del rango [0 ; 10]");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado No válido.");
        }
        entrada.close();

    }
}
