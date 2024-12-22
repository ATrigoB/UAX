package Sesion8.Ejercicio6;

//(L2) 6. Hacer un programa que lea 100 números aleatorios entre 0 y 10
// y genere un histograma con las frecuencias de cada numero.
// Para representar las barras del histograma se utilizara
//secuencias ‘*’. Por ejemplo, la secuencia: 1, 1, 3, 4, 1, 3, 1, 2,......
// generaría la siguiente salida:
//1: ****
//2: *
//3: **
//4: *

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
        }
        System.out.print(Arrays.toString(numeros));
        System.out.println();
        for (int valor = 0; valor < 11; valor++) {//explicar esto mejor
            int suma =0;
            System.out.print(valor + " : ");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == valor) {
                    System.out.print("*");
                    suma++;
                }
            }
            System.out.print(" ("+suma+")");
            System.out.println();
        }
    }
}
