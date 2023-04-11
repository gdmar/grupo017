package ar.edu.unju.fi.ejercicio15;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        int i = 320;
        while (i >= 160) {
            salida += i + " ";
            i -= 20;
        }
        System.out.println(salida);
    }
}
