package ar.edu.unju.fi.ejercicio11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner(System.in);
        String resp = "";

        while (!resp.equalsIgnoreCase("n")) {
            try {
                System.out.println("------------- Mes del año ---------------");
                System.out.print("Ingrese un valor entero: ");
                mes = entrada.nextInt();
                switch (mes) {
                    case 1:
                        System.out.println("---- Mes de Enero ----");
                        break;
                    case 2:
                        System.out.println("---- Mes de Febrero ----");
                        break;
                    case 3:
                        System.out.println("---- Mes de Marzo ----");
                        break;
                    case 4:
                        System.out.println("---- Mes de Abril ----");
                        break;
                    case 5:
                        System.out.println("---- Mes de Mayo ----");
                        break;
                    case 6:
                        System.out.println("---- Mes de Junio ----");
                        break;
                    case 7:
                        System.out.println("---- Mes de Julio ----");
                        break;
                    case 8:
                        System.out.println("---- Mes de Agosto ----");
                        break;
                    case 9:
                        System.out.println("---- Mes de Septiembre ----");
                        break;
                    case 10:
                        System.out.println("---- Mes de Octubre ----");
                        break;
                    case 11:
                        System.out.println("---- Mes de Noviembre ----");
                        break;
                    case 12:
                        System.out.println("---- Mes de Diciembre ----");
                        break;

                    default:
                        System.out.println("No existe ese mes !!");
                        break;
                }
                System.out.print("Desea Ingresar otro valor: S/N ");
                resp = entrada.next();

            } catch (Exception e) {
                System.out.println("Valor ingresado No valido !!!");
                entrada.next();
            }            
        }
        entrada.close();

    }
}
