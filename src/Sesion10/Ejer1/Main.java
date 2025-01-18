package Sesion10.Ejer1;

//Se quiere realizar una suma de dos numeros gigantes enteros. Para ello se plantea que los númerosç
// se almacenen por posiciones en una array y que se pueda realizar la operacion de suma.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] num1 = {1,9,2,4,5,7,3,2,4};
        int [] num2 = {9,5,1,5,1,9,1,3,2};
        ArrayList <Integer> resultado = new ArrayList<>();
        int cuenta = 0;
        for (int i = num1.length - 1; i >= 0 ; i--) {

           int suma = num1[i] + num2[i];
            if (cuenta > 0){
                suma += 1;
                cuenta--;
            }
            if (suma > 9 ){
                resultado.add(0,suma % 10); //aquí se podría restar 10 tambien
                cuenta++;
            }else resultado.add(0, suma);
        }
        if (cuenta > 0){
            resultado.add(0,1);
        }
        System.out.println(resultado);

    }
}
