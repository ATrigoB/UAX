package Sesion7.EjercicioVectores1.Ejer1;


// Rellenar un vector de 10 posiciones con valores introducidos por teclado.
// Deberá de mostrar los mensajes: Introduce el numero 1º, Introduce el número 2º....
// e Introduce el último número. Posteriormente los mostrará todos por pantalla en una misma línea separado por guiones

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            if (i == (numeros.length - 1)) {
                System.out.println("Introduce el último numero: ");
                numeros[i] = teclado.nextInt();
            } else {
                System.out.println("Introduce el numero " + (i + 1) + ":");
                numeros[i] = teclado.nextInt();
            }
        }
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]);

            if (i == (numeros.length - 1)) {
                System.out.println();
            } else {
                System.out.print(" - ");
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
