package ar.edu.unju.fi.ejercicio09;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int anio;
        String resp = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------- Determinar si un año es bisiesto ----------------");

        while (!(resp.equalsIgnoreCase("n"))) {
            System.out.print("Ingrese un año: ");
            try {
                anio = entrada.nextInt();
                if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
                    System.out.println("El año " + anio + " es Bisiesto !!");
                } else {
                    System.out.println("El año "+ anio + " NO es Bisiesto");
                }
                System.out.println("¿Desea Verificar otro año? S/N");
                resp = entrada.next().toLowerCase();

            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido!!");
                entrada.next();
                
            }
        }
        entrada.close();
    }
}
