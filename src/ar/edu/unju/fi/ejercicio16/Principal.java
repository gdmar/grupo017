package ar.edu.unju.fi.ejercicio16;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        int i = 320;
        do {
            salida += i + " ";
            i -= 20;
        } while (i >= 160);
        System.out.println(salida);
    }
    
}
