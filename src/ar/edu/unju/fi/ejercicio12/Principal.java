package ar.edu.unju.fi.ejercicio12;

public class Principal {
    public static void main(String[] args) {
        String salida = "";
        // int i = 2;
        System.out.println("------------------------------------------------------------------------------");
        for (int j = 40, i = 2; j > 0; j--, i++) {
            // System.out.println(j);
            salida += j*i + " ";
            // i+=1;
        }
        System.out.println(salida);
        System.out.println("------------------------------------------------------------------------------");
    }
}
