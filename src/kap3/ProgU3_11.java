package kap3;

import java.util.Scanner;

public class ProgU3_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int min = 0;
        int input;

        System.out.println("\nMoin und Willkommen beim Minimal Rechner ^^"
                + "\nGeben sie einen Anzahl für die Durchläufe ein:");
        x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Geben sie einen Zahl ein:");
            input = sc.nextInt();
            if (i == 0){
                min = input;
            } else {
                if (input < min){
                    min = input;
                }
            }
        }

        System.out.println("min = " + min);

    }
}
