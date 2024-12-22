package Sesion7.EjercicioVectores1.Ejer5;

//5. Utiliza uno de los vectores anteriores y elévalo al cuadrado

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

        //Hay dos formas:

//        //1ªForma
//        int [] resultado = new int[numeros.length];
//        for (int i = 0; i < numeros.length; i++) {
//            resultado[i] = numeros[i]*numeros[i];
//        }
//        System.out.println(Arrays.toString(resultado));
        //2ªForma
        int [] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = (int) Math.pow(numeros[i],2);
        }
        System.out.println(Arrays.toString(resultado));
    }
}
