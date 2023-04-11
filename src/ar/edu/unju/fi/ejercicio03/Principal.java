package ar.edu.unju.fi.ejercicio03;

public class Principal {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;
        double resultado;

        try {
            resultado = numero1/numero2;
            System.out.println("resultado: " + resultado);            
        } catch (ArithmeticException e) {
            System.out.println("El divisor es cero!!!");
        }
    }
}
