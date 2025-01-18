package Retos.Reto_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Paso 1: Crear el array con los valores hexadecimales
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        int[] hexaequival = new int[4];
        int[] potencias = {4096, 256, 16, 1};
        int resultado = 0;
        boolean esValido = false; // Controlará cuándo la entrada es válida
        String usuario = "";

        // Paso 2: Bucle para validar la entrada
        while (!esValido) {
            try {
                System.out.println("Introduce un número hexadecimal de 4 caracteres:");
                usuario = teclado.nextLine().toUpperCase().replaceAll("\\s", "");

                // Lanzar una excepción si la longitud no es correcta
                if (usuario.length() != 4) {
                    throw new Exception("Error: El número debe tener exactamente 4 caracteres.");
                }

                // Verificar si todos los caracteres son válidos
                for (int i = 0; i < usuario.length(); i++) {
                    char c = usuario.charAt(i); //se extrae cada caracter
                    boolean caracterValido = false;

                    // Comprobar si el carácter está en el array hexChars y convertirlo en el valor hexadecimal
                    for (int j = 0; j < hexChars.length && !caracterValido; j++) {
                        if (c == hexChars[j]) {
                            hexaequival[i] = j;
                            caracterValido = true;
                        }
                    }

                    // Si algún carácter no es válido, lanzar una excepción
                    if (!caracterValido) {
                        throw new Exception("Error: El número contiene caracteres no válidos.");
                    }
                }
                // Si todo es válido, salimos del bucle
                esValido = true;

            } catch (Exception e) {
                // Capturamos la excepción y mostramos el mensaje de error
                System.out.println(e.getMessage());
                System.out.println("Introduce un número hexadecimal válido.");
            }
        }
        for (int i = 0; i < hexaequival.length; i++) {
            int suma = hexaequival[i] * potencias[i];
            resultado = resultado + suma;
        }
        System.out.println("El numero hexadecimal:" + usuario + " es en decimal:" + resultado);
    }
}