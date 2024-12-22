package Sesion8.Ejercicio5;

//(L2) 5. Hacer un programa que pida un numero por teclado
// y después diga si el numero introducido es capicúa o no. (Mejora con String)

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Mete un numero por consola: ");
        String numeros = teclado.nextLine().trim().replaceAll("\\s", "");
        //next line le la linea completa de entrada,
        //trim elimina los espacios en blanco al principio y al final.
        //replaceALL elimina todos los espacios intermedios

        if (numeros.matches("\\d+")) {//validar que solo tenga números
            int[] digitos = new int[numeros.length()];

            for (int i = 0; i < digitos.length; i++) {//charAt(i) obtiene el carácter en la posición i de la cadena.
                digitos[i] = Character.getNumericValue(numeros.charAt(i));//getNumericValue() convierte ese carácter en su valor numérico correspondiente.
            }
            System.out.println(Arrays.toString(digitos));
            boolean esCapicua = true;

            for (int i = 0; i < numeros.length(); i++) {
                System.out.print(digitos[i]);
                if (digitos[i] != digitos[(numeros.length() - 1) - i]) {
                    System.out.print(" No coincide");
                    esCapicua = false;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(Arrays.toString(digitos));
            if (esCapicua) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else {
            System.out.println("Has introducido caracteres que no son numeros");
        }
    }
}

