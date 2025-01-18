package Retos.Reto_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Declarar los arrays que se necesitan y crea el de los meses del año
        double [] temp = {1,3.2,6.2,12.2,20.1,19.7,21.2,29.3,20.2,10.3,6.3,2.2};
        double [] ProbLluvia = {10.3,3.2,99,97.2,34.8,5.3,1.2,20.3,28,30.2,10.3};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Noviembre", "Diciembre"};

        //Calcular el mes que más llueve
        int indicelluviamax = 0;
        for (int i = 0; i < ProbLluvia.length; i++) {
            if (ProbLluvia[i] >= ProbLluvia[indicelluviamax]) {
                indicelluviamax = i;
            }
        }
        System.out.println("El mes más lluvioso es: "+meses[indicelluviamax]);
        //calcular media de temperatura
        double sumatotal= 0;
        for (int i = 0; i < temp.length; i++) {
            sumatotal += temp[i];    }
        double mediatemp = sumatotal / temp.length;

        System.out.println("la media de temperatura de 2022 es: "+String.format("%.2f",mediatemp)+" ºC");

        //verificar las condiciones
        double limiteInferiorLluvia = 0;
        double limiteSuperiorLluvia = 25;
        double limiteInferiorTemp = 10;
        double limiteSuperiorTemp = 25;
        System.out.println("Condiciones para ir de temperatura, entre: "+limiteInferiorTemp+" y "+limiteSuperiorTemp+" ºC.");
        System.out.println("Condiciones para ir de probabilidad de lluvia, entre: "+limiteInferiorLluvia+" y "+limiteSuperiorLluvia+" %.");
        for (int i = 0; i < ProbLluvia.length; i++) {
            if (ProbLluvia[i] > limiteInferiorLluvia && ProbLluvia[i] <= limiteSuperiorLluvia
                    && temp[i] > limiteInferiorTemp && temp[i] <= limiteSuperiorTemp) {

                System.out.println("El mes " + meses[i] + " cumple las condiciones:"+temp[i]+" ºC de temperatura y "+ProbLluvia[i]+"  % de probabilidad de lluvia.");
            }
        }
    }
}
