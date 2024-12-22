package Sesion10.Ejer2;

// Se pretende emular el almacén de una tienda virtual a través de vectores paralelos
// Para ello se dispone de los siguientes arrays:
// Nombre del pedido
// Precios del producto
// Stock del producto
// lapiz boligrafo sacapuntas borrador tiza
// 1.95, 9.99, 0.99, 0.89, 4.99
// 200, 145, 300, 500, 1000

//se pide que el programa realice las siguientes operaciones:
// visualizar por la pantalla un resumen de todo lo que hay en el almacen
// si se vendiera todo,¿ cuánto dinero recibiria la tienda?
// mostrar aquellos productos que tengan un stock menor de 250

// Debido a la huelga de transportes, vamos a incrementar el precio de los prodcutos un 10%.
// Crea un nuevo vector con el valor calculado ( no se modifica el de precios)

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] nombre = {"lapiz", "boligrafo","sacapuntas","borrador","tiza"};
        double [] precio = {1.95,9.99,0.99,0.89,4.99};
        int [] stock = {200,145,300,500,1000};
        ArrayList <String> producMenor250 = new ArrayList<>();
        ArrayList <Double> precioIncrem = new ArrayList<>();
        // visualizar por pantalla un resumen de todo lo que hay en el almacen
        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(precio));
        System.out.println(Arrays.toString(stock));

        //si se vendiera todo, dinero que recibiria la tienda
        double sumaTotal = 0;
        for (int i = 0; i < nombre.length; i++) {
            double suma = 0;
            suma = precio[i] * stock[i];
            sumaTotal += suma;

            if (stock[i] < 250){
                producMenor250.add(nombre[i]);
            }
        }
        System.out.print("Si se vendiera todo la tienda recibiría: "+sumaTotal+ "€");
        System.out.println();

        //Añadir el 10% del transporte a los precios

        for (int i = 0; i < nombre.length; i++) {
            double nuevasuma = 0;
            nuevasuma = precio[i] * 1.1;
            precioIncrem.add(nuevasuma);
        }
        System.out.println("Nuevos precios con la suma del transporte: "+precioIncrem);
        System.out.println("Stock menor de 250: "+producMenor250);
    }
}
