package ar.edu.unju.fi.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota5;
        float nota6;
        float nota7;
        float nota8;

        double promedio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                Ingrese las Notas ");
        try {
            System.out.print("nota 1:");
            nota1 = entrada.nextFloat();
            System.out.print("nota 2:");
            nota2 = entrada.nextFloat();
            System.out.print("nota 3:");
            nota3 = entrada.nextFloat();
            System.out.print("nota 4:");
            nota4 = entrada.nextFloat();
            System.out.print("nota 5:");
            nota5 = entrada.nextFloat();
            System.out.print("nota 6:");
            nota6 = entrada.nextFloat();
            System.out.print("nota 7:");
            nota7 = entrada.nextFloat();
            System.out.print("nota 8:");
            nota8 = entrada.nextFloat();
            promedio = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8)/8;
            System.out.println("Promedio: "+ promedio );            
        } catch (InputMismatchException e) {
            System.out.println("Hubo un error al ingresar una nota.");
        }
        entrada.close();
    }

}
