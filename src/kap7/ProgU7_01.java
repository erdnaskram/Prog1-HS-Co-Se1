package kap7;

import java.util.Scanner;

public class ProgU7_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMoin und Willkommen beim Stringvergleicher ^^ "
                + "\nGeben sie einen String ein:");
        String first = sc.next();

        System.out.println("\nGeben sie einen zweiten String ein:");
        String second = sc.next();

        System.out.println("Differenz: " + first.compareTo(second));
    }
}
