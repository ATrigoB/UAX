package Sesion11.Ejer6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Noviembre", "Diciembre"};
        double [] tempMedia = new double[meses.length];
        for (int i = 0; i < meses.length; i++) {

            System.out.println("Introduce la temperatura media del mes de "+meses[i]);
            tempMedia[i] = teclado.nextDouble();
        }
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i]+":");

            for (int j = 0; j < tempMedia[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" ("+tempMedia[i]+")ºC");
        }
    }
}
