package Sesion8.Ejercicio4Mejorado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el tamaño del vector: ");
        int tam = teclado.nextInt();
        int[] numerosAleatorios = new int[tam];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) ((Math.random() * 300) + 1);
        }
        System.out.println(Arrays.toString(numerosAleatorios));

        //Arrays dinámicos...son listas
        ArrayList<Integer> numerosDigito = new ArrayList<>();

        System.out.println("Dime el ultimo dígito: ");
        int digito = teclado.nextInt();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] % 10 == digito){
                numerosDigito.add(numerosAleatorios[i]);
            }
        }
        System.out.println(numerosDigito);
    }
}
