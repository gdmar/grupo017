package ar.edu.unju.fi.ejercicio13;

public class Principal {
    public static void main(String[] args) {
        int i = 1;
        String salida = "";
        do {
            salida += i*4 + " ";
            i += 1;
        } while (i*4 <= 100);
        System.out.println(salida);
    }
}
