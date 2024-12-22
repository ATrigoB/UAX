package Sesion7.EjercicioVectores1.Ejer3;

//3.Utiliza uno de los vectores anteriores
// y almacena en ese mismo vector el resto de la división de cada número por 13

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int min = 1;
        int max = 100;
        int [] resto = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        for (int i = 0; i < numeros.length; i++) {
            resto [i] = numeros[i] % 13;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(resto));

    }
}
