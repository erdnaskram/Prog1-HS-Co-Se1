package kap3;

import java.util.Scanner;

public class ProgU3_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0;
        double e = 0;
        double i = 0;
        double o = 0;
        double u = 0;
        double koUSz = 0;

        boolean run;

        String input;
        String part;

        System.out.println("\nMoin und Willkommen beim Vokal Rechner ^^");

        do {

            System.out.println("\nGeben sie einen Satz ein:");
            input = sc.nextLine();

            for (int j = 0; j < input.length() -1 ; j++) {
                part = input.substring(j, j+1);

                switch (part) {
                    case "a" -> a++;
                    case "e" -> e++;
                    case "i" -> i++;
                    case "o" -> o++;
                    case "u" -> u++;
                    default -> koUSz++;
                }
            }

            System.out.println("a = " + a);
            System.out.println("e = " + e);
            System.out.println("i = " + i);
            System.out.println("o = " + o);
            System.out.println("u = " + u);
            System.out.println("koUSz = " + koUSz);

            System.out.println("Beenden? (j) oder (n)");

            input = sc.nextLine();
            run = input.equals("n");

        } while (run);

    }
}
