package kap7;

import java.util.Scanner;

public class ProgU7_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean match;
        int start;
        int length;

        System.out.println("\nMoin und Willkommen beim Stringvergleicher Part zwo ^^ "
                + "\nGeben sie einen String ein:");
        String first = sc.next().toLowerCase();

        System.out.println("\nGeben sie einen zweiten String ein:");
        String second = sc.next().toLowerCase();

        System.out.println("\nGeben sie einen Startwert ein:");
        start = sc.nextInt();

        System.out.println("\nGeben sie eine Länge ein:");
        length = sc.nextInt();

        match = first.regionMatches(start, second, start, length);

        if (match) System.out.println("Es ist ein Match");
        else System.out.println("Es ist kein Match");
    }
}
