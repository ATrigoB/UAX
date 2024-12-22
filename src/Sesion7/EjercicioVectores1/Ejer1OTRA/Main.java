package Sesion7.EjercicioVectores1.Ejer1OTRA;

// Rellenar un vector de 10 posiciones con valores introducidos por teclado.
// Deberá de mostrar los mensajes: Introduce el numero 1º, Introduce el número 2º....
// e Introduce el último número. Posteriormente los mostrará todos por pantalla en una misma línea separado por guiones

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];
        String mensaje = "";
        for (int pos = 0; pos < numeros.length; pos++) {

            if (pos == numeros.length - 1) {
                System.out.print("Introduce el ultimo numero: ");
            } else {
                System.out.print("Introduce el numero " + (pos + 1) + ": ");
            }
            numeros[pos] = teclado.nextDouble();
//            mensaje += numeros[pos];
//            if (pos < numeros.length - 1) {
//                mensaje += " - ";
//            }
        }
        System.out.println(mensaje);
//        for (int pos = 0; pos < numeros.length; pos++) {
//            System.out.print(numeros[pos]);
//            if (pos < numeros.length - 1) {
//                System.out.print(" - ");
//            } else {
//                System.out.println();
//            }
//        }


    }

}
