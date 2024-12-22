package Sesion8.Ejercicio4;

//4. Hacer un programa que cree un array cuyo tamaño se pedirá por teclado
// y cuyo contenido serán números aleatorios entre 1 y 300.
// Posteriormente se creara otro array que guardara aquellos números del primer array que acaben en un dígito
// que se indicara por teclado (se debe controlar que se introduce un numero correcto).
// Finalmente, mostrar por pantalla los dos arrays. (L2). (Mejora con ArrayList)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce cuántos numeros aleatorios quieres que salgan: ");

        int[] numeros1 = new int[teclado.nextInt()];

        for (int i = 0; i < numeros1.length; i++) {

            numeros1[i] = (int) ((Math.random() * 300) + 1);
        }
        System.out.println(Arrays.toString(numeros1));

//        String[] numeroscadena = new String[numeros1.length];
//        for (int i = 0; i < numeroscadena.length; i++) {
//
//            numeroscadena[i] = Integer.toString(numeros1[i]);
//        }

        System.out.println("Muestra los numeros acabados en: ");
        int numeroUsuario = teclado.nextInt();
        int[] numeros2 = new int[numeros1.length];
        int iniciovector2 = 0;
        String numerocadena = "";

        for (int i = 0; i < numeros1.length; i++) {

            numerocadena = Integer.toString(numeros1[i]);
            String ultimacadena = "";
            ultimacadena += numerocadena.charAt(numerocadena.length() - 1);

            int ultimodigito = Integer.valueOf(ultimacadena);
            if (numeroUsuario == ultimodigito) {

                numeros2[iniciovector2] = numeros1[i];
                iniciovector2++;
            }
        }
        int [] vectorfinal = Arrays.copyOfRange(numeros2, 0,  iniciovector2);
        System.out.println(Arrays.toString(vectorfinal));

//        for (int i = 0; i < numeroscadena.length; i++) {
//
//            String[] digitos = numeroscadena[i].split("");
//            for (int j = 0; j < digitos.length; j++) {
//
//                System.out.print(digitos[j]+ " ");
//            }
//            System.out.println(digitos.length);
//            System.out.println();
//
//        }
//
//        System.out.println("Muestra los numeros acabados en: ");
//        int digitoacaba = teclado.nextInt();

    }
}
