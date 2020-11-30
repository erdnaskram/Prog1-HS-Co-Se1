package kap3;

import java.util.Random;
import java.util.Scanner;

public class ProgU3_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int z1;
        int z2;
        int op;
        double ergebnis;
        String inputString;
        double input = 0;
        boolean retry;

        System.out.println("\nMoin und Willkommen beim Rechenaufgaben Generator ^^");


        while (true) {
            op = random.nextInt(3);
            z1 = random.nextInt(31);
            z2 = random.nextInt(30) + 1;

            switch (op) {
                case 0 -> {
                    System.out.println(z1 + " + " + z2 + " =");
                    ergebnis = z1 + z2;
                }
                case 1 -> {
                    System.out.println(z1 + " - " + z2 + " =");
                    ergebnis = z1 - z2;
                }
                case 2 -> {
                    System.out.println(z1 + " * " + z2 + " =");
                    ergebnis = z1 * z2;
                }
                case 3 -> {
                    System.out.println(z1 + " / " + z2 + " =");
                    ergebnis = z1 / z2;
                }
                default -> throw new IllegalStateException("Unexpected value: " + op);
            }

            do {
                retry = false;
                inputString = sc.nextLine();
                try {
                    input = Integer.parseInt(inputString);
                } catch (NumberFormatException e) {
                    retry = true;
                    System.err.println("Des is ka zahl");
                }
            }while (retry);

            if (input == ergebnis) {
                System.out.println("Basst scho");
            } else {
                System.out.println("is falsch");
            }
        }

    }
}
