package Sesion11.Ejer5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numAleator = new int[100];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numAleator.length; i++) {
            numAleator[i] = (int) (Math.random() * 21);
            System.out.print(numAleator[i]+" ");
        }
        System.out.println();
        System.out.println(" Introduce dos valores por teclado: ");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();

        for (int i = 0; i < numAleator.length; i++) {
            System.out.print(numAleator[i]+" ");
            if (numAleator[i] == valor1){
                numAleator[i] = valor2;
                System.out.print("\""+valor2+"\" ");
            }
        }
    }
}
