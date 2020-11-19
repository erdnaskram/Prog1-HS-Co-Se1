package kap3;

import java.util.Scanner;

public class ProgU3_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double z1 = 0;
        double z2 = 0;
        double fibonacci = 0;

        System.out.println("\nMoin und Willkommen beim Fibonacci Rechner ^^"
                + "\nGeben sie einen Wert für n ein:");
        n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            if (i == 0) {
                fibonacci = 0;
            } else if (i == 1) {
                fibonacci = 1;
            } else {
                fibonacci = z1 + z2;
            }
            z1 = z2;
            z2 = fibonacci;
        }

        System.out.println("Fibonacci Zahl: f" + n + " = " + fibonacci);
    }
}
