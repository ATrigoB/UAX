package Sesion8.Ejercicio2;
//2. Hacer un programa que rellene un array con los 100 primeros números enteros
// y los muestre en pantalla en orden inverso a como se han introducido (orden inverso). (L1)
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.print(numeros[i]);
            if (i != 0) {
                System.out.print(" - ");
            } else System.out.println();
        }
//        for (int i = 0; i < numeros.length;i++) {
//            numeros [i] = 100 - i;
//            System.out.print(numeros[i]+ " - ");
//        }
    }
}
