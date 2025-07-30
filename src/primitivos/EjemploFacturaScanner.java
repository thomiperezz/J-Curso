package primitivos;

import java.util.Scanner;

public class EjemploFacturaScanner {
    public static void main(String[] args) {
        double precioPrimerProducto;
        double precioSegundoProducto;
        double totalBrutoProductos;
        double totalImpuestos;
        double totalFactura;

        try {
            Scanner nombreFactura = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la factura: ");
            String nombre = nombreFactura.nextLine();
            System.out.println("Ingrese el precio del primer producto: ");
            precioPrimerProducto = nombreFactura.nextDouble();
            System.out.println("Ingrese el precio del segundo producto: ");
            precioSegundoProducto = nombreFactura.nextDouble();

            totalBrutoProductos = (precioPrimerProducto + precioSegundoProducto);
            totalImpuestos = (totalBrutoProductos * 0.19);
            totalFactura = (precioPrimerProducto + precioSegundoProducto)*1.19;
            String mensaje = "La factura " + nombre + " tiene un total bruto de " + Double.toString(totalBrutoProductos) +
                    "$, tiene un total de impuestos de " + Double.toString(totalImpuestos) +
                    "$ y el total de la factura es " + Double.toString(totalFactura) + "$";
            System.out.println(mensaje);
        } catch (Exception e) {
            System.out.println("Error al ingresar alguno de los datos..");
            main(args);
        }


    }
}
