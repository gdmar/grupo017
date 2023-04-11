package ar.edu.unju.fi.ejercicio17.model.domain;

public class CalculadoraEspecial {

    private int n;

    /**
     * Método que retorna el valor de n.
     * @return int
     */
    public int getN() {
        return n;
    }

    /**
     * Método que asigna un valor a n.
     * @param n int.
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Contructor parametrizado
     * @param n int.
     */
    public CalculadoraEspecial(int n) {
        this.n = n;
    }

    /**
     * Método que calcula la sumatoria de la expresión 
     * ((i*(i+1))/2)^2.
     * @return double que es el resultado de la sumatoria.
     */
    public double calcularSumatoria() {
        double sumatoria = 0;
        double base;
        for (int i = 1; i <= this.n; i++) {
            base = (i * (i + 1)) / 2;
            sumatoria += Math.pow(base, 2);
        }
        return sumatoria;
    }

    /**
     * Método que calcula la productoria de la expresión 
     * (k*(k+4)).
     * @return double que es el resultado de la sumatoria.
     */
    public double calcularProductoria() {
        double productoria = 1;
        for (int i = 1; i <= this.n; i++) {
            productoria *= i * (i + 4);
        }
        return productoria;
    }

    /**
     * Método que determina si un número es primo.
     * @param numero tipo int.
     * @return true si el número es primo, en otro caso retorna false.
     */
    public boolean esPrimo(int numero) {
        // si el número es par
        if (numero % 2 == 0) {
            return false;
        }
        // se verifica los números impares.
        // solo se verifica hasta la mitad de "n" (raiz cuadrada del n).
        for (int i = 3; i * i < Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que genera los primeros "n" numeros primos. y los muestra por consola.
     * @param n int. cantidad de números a generar.
     */
    public void calcularPrimos(int n) {
        String salida = "";
        int contador = 1;
        int numero = 2;
        while (contador <= n) {
            if (esPrimo(numero)) {
                salida = salida + String.valueOf(numero) + " ";
                numero += 1;
                contador += 1;
            } else {
                numero +=1;
            }
        }
        System.out.println(salida);
    }

    /**
     * método que calcula la masa corporal de una persona en base a su peso(kg) y altura(m).
     * IMC = peso / altura^2.
     * si IMC está entre 18.5 y 25, está en su peso normal.
     * si IMC es menor a 18.5 entonces está por debajo de su peso.
     * si IMC es superior a 25, entonces tiene sobrepeso.
     * @param peso double. peso en kilogramos
     * @param altura double. altura en metros.
     */
    public void calcularIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("IMC: " + imc + " Está por debajo de su peso ideal");
        } else {
            if (imc >= 18.5 && imc <=25){
                System.out.println("IMC: " + imc + " Está en su peso normal");
            } else {
                System.out.println("IMC: " + imc + " Tiene sobre peso");
            }
        }        
    }


}
