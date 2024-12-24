package Sesion11.Ejer1;

/*
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[10];

        System.out.println("Introduce 10 numeros por teclado: ");
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> inversos = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();

            inversos.add(0,numeros[i]);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(inversos);
    }
}
