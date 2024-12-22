package Sesion7.EjercicioVectores1.Ejer2;

//Rellenar un vector de 10 posiciones con valores del 1 al 100,
//para ello utiliza el método Math.random() * 101

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) ((Math.random ()*100) +1);
        }
        System.out.println(Arrays.toString(numeros));
    }
}
