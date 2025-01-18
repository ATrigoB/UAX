package Retos.Reto_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String correo;
        boolean esvalido = false;

        while (!esvalido){

            try {
                System.out.println("Introduce un correo electronico para iniciar sesión");
                correo = teclado.next();

                //lanzar una excepción si empieza por un caracter que no sea una letra
                if (!Character.isLetter(correo.charAt(0))) {
                    throw new Exception("Error: el correo tiene que empezar por una letra");
                }
                // Debe de contener el simbolo @, solo una vez
                int contadorArroba = 0;
                for (int i = 0; i < correo.length(); i++) {
                    if (correo.charAt(i) == '@') {
                        contadorArroba++;
                    }

                }
                if (contadorArroba != 1){
                    throw new Exception("Error: El correo debe contener exactamente un '@'");
                }
                // y depués de @ tiene que haber algún caracter valido
                int arrobaPos = correo.indexOf('@');
                String parteDespuesArroba = correo.substring(arrobaPos + 1);
                if (parteDespuesArroba.isEmpty() || !Character.isLetterOrDigit(parteDespuesArroba.charAt(0))) {
                    throw new Exception("Error: Después del '@' debe haber al menos un carácter valido).");
                }
                // debe termminar en .es o .com
                if (!(correo.endsWith(".es") || correo.endsWith(".com"))) {
                    throw new Exception("Error: El correo debe terminar en '.es' o '.com'.");
                }
                esvalido = true;
                System.out.println("El correo " + correo + " es válido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, inténtalo de nuevo.");
            }
        }
    }
}
