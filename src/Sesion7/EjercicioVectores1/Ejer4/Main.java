package Sesion7.EjercicioVectores1.Ejer4;

//4. Utiliza uno de los vectores anteriores y multiplícalo entero por un número introducido por el usuario

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int min = 1;
        int max = 100;
        int [] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Introduce un numero por el que multiplicar cada uno de estos: ");
        int numeroUsuario = teclado.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            resultado [i] = numeros[i] * numeroUsuario;
        }
        System.out.println(Arrays.toString(resultado));

    }
}
