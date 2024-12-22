package Sesion8.Ejercicio3;

//3. Hacer un programa que cree un array de 10 posiciones de números aleatorios entre 1 y 100.
// Posteriormente se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición. (L1)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Introduce una numero para ver la posición");
        int numIntroducido = teclado.nextInt();

        if (numIntroducido > (numeros.length - 1) || numIntroducido < 0) {
            System.err.println("Numero fuera de los valores de la posición, debe de estar entre: 0 y " + (numeros.length - 1));
        }

        System.out.println("Valor de posición: " + numIntroducido + " es " + numeros[numIntroducido]);

    }
}
