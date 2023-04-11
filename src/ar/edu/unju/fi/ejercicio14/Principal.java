package ar.edu.unju.fi.ejercicio14;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        for (int i = 320; i >= 160; i -= 20) {
            salida += i + " ";
        }
        System.out.println(salida);
    }
}
