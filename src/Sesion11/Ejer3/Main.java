package Sesion11.Ejer3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }
        int max = 0;
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(max + " máximo");
        System.out.println(min + " mínimo");
        //se puede hacer con arrays.sort --> ordena de menor a mayor;
    }
}
