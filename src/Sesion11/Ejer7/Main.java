package Sesion11.Ejer7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numale = new int[20];

        for (int i = 0; i < numale.length; i++) {
            numale[i] = (int) (Math.random() * 401);

        }
        System.out.println(Arrays.toString(numale));

        System.out.println("¿Qué números quiere resaltar?");
        System.out.print("1 – los múltiplos de 5,: ");
        System.out.println("2 – los múltiplos de 7): ");

        int numMulti = teclado.nextInt();

        if (numMulti == 1) {
            for (int i = 0; i < numale.length; i++) {
                int multiplo5 = numale[i] % 5;
                if (multiplo5 == 0) {
                    System.out.print("[" + numale[i] + "] ");
                } else System.out.print(numale[i] + " ");
            }
        }
        if (numMulti == 2) {
            for (int i = 0; i < numale.length; i++) {
                int multiplo7 = numale[i] % 7;
                if (multiplo7 == 0) {
                    System.out.print("[" + numale[i] + "] ");
                } else System.out.print(numale[i] + " ");
            }
        }
    }
}
