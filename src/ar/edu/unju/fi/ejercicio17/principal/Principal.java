package ar.edu.unju.fi.ejercicio17.principal;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.domain.CalculadoraEspecial;

public class Principal {
    public static void main(String[] args) {
        int n;
        int cantidadNumPrimos;
        double peso;
        double altura;
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese el valor n para la calculadora: ");
            n = entrada.nextInt();
            CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial(n);
            System.out.println("La sumatoria es: " + calculadoraEspecial.calcularSumatoria());
            System.out.println("La productoria es: "+ calculadoraEspecial.calcularProductoria());
            System.out.print("Ingrese la cantidad de números primos a generar: ");
            cantidadNumPrimos = entrada.nextInt();
            System.out.println("Los "+ cantidadNumPrimos + " primeros números primos: ");
            calculadoraEspecial.calcularPrimos(cantidadNumPrimos);
            System.out.print("Ingrese el peso: ");
            peso = entrada.nextDouble();
            System.out.print("Ingrese la altura: ");
            altura = entrada.nextDouble();
            calculadoraEspecial.calcularIMC(peso, altura);
            
        } catch (Exception e) {
            System.out.println("Un valor ingresado no es válido");
        }
        
        entrada.close();


    }
}
