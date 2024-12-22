package ClaseExperiencial.Ahoracado;

//Ahorcado, adivinar una palabra a través de introduccion de letras
//Hay un numero de intentos definidos (5)-- se dibuja el ahorcado
//El usuario sabe el numero de letras y la posición... Ponemos guiones
//El usuario ve las letras que ha acertado
//El usuario gane (ponga todas las letras)
// Que el usuario pierda, supera el máximo de letras

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String palabraAdivinar = "padel";
        String [] vectorPalabraAdivinar = new String[palabraAdivinar.length()];
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            vectorPalabraAdivinar[i] = String.valueOf(palabraAdivinar.charAt(i));
        }

        int errores = 0;
        String[] vectoraciertos = new String[palabraAdivinar.length()];
        Arrays.fill(vectoraciertos, "-");
        String[] letrasIntroducidas = new String[(palabraAdivinar.length() + 5)];
        Arrays.fill(letrasIntroducidas, "-");
        int letra = 0;
        String letraUsuario = "";
        do {
            int coincide = 0;
            do {
                System.out.println("Letras introducidas: " + Arrays.toString(letrasIntroducidas));
                System.out.println("Introduce una letra: ");
                letraUsuario = teclado.next().toLowerCase();
                coincide = 0;
                for (int i = 0; i < letrasIntroducidas.length; i++)
                    if (letraUsuario.equalsIgnoreCase(String.valueOf(letrasIntroducidas[i]))) {
                        System.out.println("Ya has introducido esta letra, por favor introduce otra");
                        coincide++;
                    }
            } while (coincide > 0) ;

            int aciertos = 0;
            for (int i = 0; i < palabraAdivinar.length(); i++) {

                if (palabraAdivinar.charAt(i) == letraUsuario.charAt(0)) {
                    vectoraciertos[i] = letraUsuario;
                    aciertos++;
                    System.out.print(" la " +letraUsuario+ " se encuentra en posición :" + (i +1));
                }
            }
            System.out.println();
            letrasIntroducidas [letra] = letraUsuario;
            letra++;
            if (aciertos == 0) {
                System.out.println("La palabra no contiene ninguna " +letraUsuario);
                errores++;
                System.out.println(" La letra: \"" +letraUsuario+ "\" no está" );
            }
            System.out.println("Palabra a adivinar: "+Arrays.toString(vectoraciertos));
            System.out.println("Llevas: " + errores + " error");
        } while (errores < 5 && !Arrays.equals(vectoraciertos,vectorPalabraAdivinar));
        if (Arrays.equals(vectoraciertos,vectorPalabraAdivinar)){
            System.out.println(" Has ganado");
        }
        if (errores == 5){
            System.out.println("Has perdido");
        }
    }
}
//Voy a trabajar con arrays, para poder recorrer las letras de la palabra

//String [] vectorPalabraAdivinar = new String[PalabraAdivinar.length()];
//        Arrays.fill(vectorPalabraAdivinar, "-");
//        System.out.print(Arrays.toString(vectorPalabraAdivinar));