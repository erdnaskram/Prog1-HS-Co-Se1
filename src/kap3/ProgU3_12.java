package kap3;


public class ProgU3_12 {
    public static void main(String[] args) {

        System.out.println("Aufgabe A:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nAufgabe B:");

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nAufgabe D:");

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nAufgabe D:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
