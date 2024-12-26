package Sesion11.Ejer4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros));
        int lastnum = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i >= 1; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = lastnum;
        System.out.println(Arrays.toString(numeros));

    }
}
