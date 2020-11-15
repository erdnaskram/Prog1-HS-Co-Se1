package kap3;

import java.util.Scanner;

public class ProgU3_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        System.out.println("\nMoin und Willkommen beim Spaghetti Rechner ^^"
                + "\nGeben sie einen Wert für x ein:");
        x = sc.nextInt();

        if (x == 0) {
            System.out.println("x = " + x);
        } else if (x > 2005) {
            x = (int) Math.sqrt(x);
        } else {
            x = x * (x+x);
            x = x * x;
            System.out.println("x = " + x);
        }
        
    }
}
