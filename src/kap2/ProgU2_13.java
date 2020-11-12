package kap2;

import java.util.Scanner;

public class ProgU2_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Input Variablen */
        double x;
        double y;
        int n;
        int m;
        double a0 = 1.0;
        double a1 = 2.5;
        double a2 = 0.1;
        double a3 = 0.0;
        double a4 = 0.8;
        double a5 = 0.0;
        double a6 = 1.5;

        System.out.println("\nMoin und Willkommen beim Zahlenrechner ^^"
                + "\nGeben sie einen Wert für n ein:");
        n = sc.nextInt();
        System.out.println("Geben sie einen Wert für m ein");
        m = sc.nextInt();
        System.out.println("Geben sie einen Wert für x ein");
        x = sc.nextDouble();

        //Ausdruck 1
        y = Math.log(Math.abs(n-m)*x);
        System.out.println("1) y = " + y);

        //Ausdruck 2
        y = Math.sin( (n+m) / 2.0 * x ) - Math.cos( (n-m) / 2.0 * x );
        System.out.println("2) y = " + y);

        //Ausdruck 3
        y = 0.5 * (n-m)/(n+m) * x * Math.exp( -(n+m) * Math.pow(x,2.0) );
        System.out.println("3) y = " + y);

        //Ausdruck 4
        y = a0 - a1*x + a2*Math.pow(x,2.0) - a3*Math.pow(x,3.0) + a4*Math.pow(x,4.0) - a5*Math.pow(x,5.0)
                + a6*Math.pow(x,6.0);
        System.out.println("4) y = " + y);

        //Ausdruck 5 TODO FEHLER
        y = Math.pow( (Math.exp(x) + x),2.0 ) / ( 0.5 * x + Math.exp(x) ) - Math.exp(x);
        System.out.println("5) y = " + y);
    }
}
