package Sesion7.EjercicioVectores1.Ejer8;

//8. Utiliza uno de los vectores anteriores, ¿cuántos números pares hay?

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[10];
        int min = 1;
        int max = 100;

        int pares = 0;

        for (int i = 0; i < numeros.length ; i++) {
            numeros [i] = (int) (Math.random() * (max - min + 1)) + min;

            if ((numeros[i] % 2) == 0 ) {
                pares++;
            }
        }
        System.out.println("Hay "+pares+" numeros pares");
        System.out.println(Arrays.toString(numeros));

    }
}
