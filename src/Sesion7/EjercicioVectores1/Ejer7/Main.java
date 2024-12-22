package Sesion7.EjercicioVectores1.Ejer7;

//7. Utiliza uno de los vectores anteriores y dime cuál es el valor más alto y el más bajo

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] numeros = new int[10];
        int min = 1;
        int max = 100;

        int numMax = numeros[0];
        int numMin = numeros[0];

        for (int i = 1; i < numeros.length ; i++) {
            numeros [i] = (int) (Math.random() * (max - min + 1)) + min;

            if (numeros[i] > numMax) {
                numMax = numeros [i];
            }
            if (numeros[i] < numMin ){
                numMin = numeros [i];
            }
        }
        System.out.println("El numero más bajo es: "+numMin);
        System.out.println("El numero más alto es: "+numMax);
        System.out.println(Arrays.toString(numeros));

    }
}
