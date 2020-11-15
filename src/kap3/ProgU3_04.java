package kap3;

import java.util.Scanner;

public class ProgU3_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int points;
        boolean end = false;

        System.out.println("\nMoin und Willkommen bei Maexle v0.1 ^^");

        do {
            do {
                System.out.println("\nGeben sie die 1. Würfelzahl ein ein:");
                x = sc.nextInt();
                if (x == 000) {
                    end = true;
                }else if (x < 1 || x > 6) {
                    System.out.println("Fehlerhafte Eingabe: " + x);
                    System.out.println("Nur Werte von 1 bis 6 sind gültig, bitte versuchen sie es erneut!");
                }
            } while ((x < 1 || x > 6) && end == false);

            if (end == false) {
                do {
                    System.out.println("\nGeben sie die 2. Würfelzahl ein ein:");
                    y = sc.nextInt();
                    if (y < 1 || y > 6) {
                        System.out.println("Fehlerhafte Eingabe: " + y);
                        System.out.println("Nur Werte von 1 bis 6 sind gültig, bitte versuchen sie es erneut!");
                    }
                } while (y < 1 || y > 6);


                if (x == y) {
                    points = 100 * x;
                } else {
                    if (x < y) {
                        points = y * 10 + x;
                    } else {
                        points = x * 10 + y;
                    }
                }

                if (points == 21) {
                    points = 1000;
                }

                System.out.println("Ihre Punkte sind " + points);
            }
        } while (end == false);

        System.out.println("Bis zum nächsten mal ^^");

    }
}
