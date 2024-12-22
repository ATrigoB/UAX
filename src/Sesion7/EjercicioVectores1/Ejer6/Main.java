package Sesion7.EjercicioVectores1.Ejer6;

//6. Utiliza uno de los vectores anteriores y calcula la media con los números que contiene

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int min = 1;
        int max = 100;

        for (int i = 0; i < numeros.length ; i++) {
            numeros [i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println(Arrays.toString(numeros));

        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];
        }
        double media = suma / numeros.length;
        System.out.println("La media es: "+media);
    }
}
