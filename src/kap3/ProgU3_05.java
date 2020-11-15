package kap3;

import java.util.Scanner;

public class ProgU3_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int summe = 0;

        System.out.println("\nMoin und Willkommen beim Dreier-Summen Rechner ^^"
                + "\nGeben sie einen Wert für n ein:");
        n = sc.nextInt();

        if (n % 3 > 0) {
            n = n - (n % 3);
        }

        for (int i = 0; i <= n; i = i+3) {
            summe = summe + i;
        }

        System.out.println("summe = " + summe);

    }
}
