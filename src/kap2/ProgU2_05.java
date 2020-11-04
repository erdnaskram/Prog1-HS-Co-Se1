package kap2;

import java.util.Scanner;

public class ProgU2_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /* Input Variablen */
        double x;
        double y;
        double z;

        System.out.println("\nMoin und Willkommen beim Formnelrechner ^^" + "\ngeb eine zahl für x ein");
        x = sc.nextDouble();
        System.out.println("geb eine Zahl für y ein");
        y = sc.nextDouble();

        //Rechnung 1
        z = Math.pow(x,2) * Math.pow(y,2) - (4 * x * y) + 4;
        System.out.println("Rechnung 1:");
        System.out.println("z = " + z);

        //Rechnung 2
        z = Math.pow((1 + y * x),2) / (1 + Math.pow((1 + y * x),4));
        System.out.println("Rechnung 2:");
        System.out.println("z = " + z);

        //Rechnung 3
        z = x*y + (3 - x) * y - y;
        System.out.println("Rechnung 3:");
        System.out.println("z = " + z);

        //Rechnung 4
        z = 2*y;
        System.out.println("Rechnung 4:");
        System.out.println("z = " + z);
    }
}
