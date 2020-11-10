package kap2;

import java.util.Scanner;

public class ProgU2_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/**
 * Is noch ned fertig
 * TODO
 */

        /* Input Variablen */
        double x;
        double y;
        double z;

        System.out.println("\nMoin und Willkommen beim Formnelrechner ^^" + "\ngeb eine zahl für x ein");
        x = sc.nextDouble();
        System.out.println("geb eine Zahl für y ein");
        y = sc.nextDouble();



        //Ausdruck 5
        z = (Math.exp(x)/(0.5*x+Math.pow(Math.E,x))-Math.pow(Math.E,x));
        System.out.println("z = " + z);
    }
}
