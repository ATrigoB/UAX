package Sesion8.Ejercicio1;

//1. Hacer un programa que calcule la letra de un DNI.
// Se pedirá el DNI por teclado y devolverá el DNI la letra.
// Para bus car la letra, se calcula el resto de dividir el dni entre 23, y con el resultado que estará entre 0 y 22,
// se busca en el array de caracteres la letra correspondiente. El orden de los caracteres es: (L1)
//T, R, W, A, G, M,Y, F, P, D, X, B, N, J, Z, S, Q,V, H, L, C, K, E

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        int dni = teclado.nextInt();
        int resto = dni % 23;
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
                'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println(dni + " - " + letra[resto]);

//        for (int i = 0; i < letra.length; i++) {
//
//
//
//        }

    }
}
