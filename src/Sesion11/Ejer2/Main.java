package Sesion11.Ejer2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Crear 3 arrays con 20 numeros cada una

        int [] numeros = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 101);

            cuadrado[i] = (int) (Math.pow(numeros[i],2));

            cubo[i] = (int) (Math.pow(numeros[i],3));
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(cuadrado));
        System.out.println(Arrays.toString(cubo));
    }
}
