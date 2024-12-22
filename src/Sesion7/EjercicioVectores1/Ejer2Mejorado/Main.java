package Sesion7.EjercicioVectores1.Ejer2Mejorado;

//Rellenar un vector de 10 posiciones con valores del 1 al 100,
// para ello utiliza el método Math.random() * 101

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
     }
}
