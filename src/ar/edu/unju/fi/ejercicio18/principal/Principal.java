package ar.edu.unju.fi.ejercicio18.principal;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.domain.Producto;

public class Principal {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        String nombre;
        int codigo;
        double precio;
        String categoria;
        int descuento = 0;
        Scanner entrada = new Scanner(System.in);
        boolean descuentoValido;
        for (int i = 0; i < 3; i++) {
            descuentoValido = false;
            System.out.println("----------------------------------------------------------");
            System.out.print("Ingrese Nombre del producto: ");
            nombre = entrada.next();
            System.out.print("Ingrese el código del producto: ");
            codigo = entrada.nextInt();
            System.out.print("Ingrese el precio del producto: ");
            precio = entrada.nextDouble();
            System.out.print("Ingrese la categoria del producto: ");
            categoria = entrada.next();
            while(!descuentoValido){
                System.out.print("Ingrese el descuento del producto: ");
                descuento = entrada.nextInt();
                if (descuento>=0 && descuento<=50) {
                    descuentoValido = true;
                } else {
                    System.out.println("Descuento no valido. Tiene que ser entre 0 y 50");
                }
            }
            
            Producto p = new Producto(nombre, codigo, precio, categoria, descuento);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                        Dato del producto");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Categoría: " + p.getCategoria());
            System.out.println("Descuento: " + p.getDescuento());
            System.out.println("Precio del producto con descuento: " + p.calcularDescuento());

        }

            
        entrada.close();
    }
}
