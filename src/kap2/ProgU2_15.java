package kap2;

import java.util.Scanner;
import java.util.stream.LongStream;

public class ProgU2_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float zaehler = (float) 2.5E27;
        float nenner = (float) 3.4E-12;

        //Aufgabe 1
        System.out.println("Aufgabe 1:");
        System.out.println(zaehler / nenner);

        //Aufgabe 2
        System.out.println("\nAufgabe 2:");
        System.out.println(Math.sqrt(-4));
        System.out.println(0.0/0.0);
        System.out.println(1E300*1E20);
        System.out.println(-1E300*1E20);

    }
}
