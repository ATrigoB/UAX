package Sesion11.Ejer8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeale = new int[10];

        for (int i = 0; i < numeale.length; i++) {

            numeale[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(numeale));
        int numUsuario;
        boolean fuera = true;
        do {
            System.out.println("Introduce un numero para comprobar que está en el vector: ");
            numUsuario = teclado.nextInt();
            for (int i = 0; i < numeale.length; i++) {

                if (numeale[i] == numUsuario) {
                    fuera = false;
                }
            }
            System.out.println("El numero introducido no se encuentra en el vector");
        } while (fuera);

        do {
            int lastnum = numeale[numeale.length - 1];
            for (int i = numeale.length - 1; i >= 1; i--) {
                numeale[i] = numeale[i - 1];
            }
            numeale[0] = lastnum;
            System.out.println(Arrays.toString(numeale));
        } while (numeale[0] != numUsuario);
    }
}
