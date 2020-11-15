package kap3;

import java.util.Scanner;

public class ProgU3_03 {
    public static void main(String[] args) {

        int x = 5;
        int y = 8;

        System.out.println("\nMoin und Willkommen beim Dangling-Else Rechner ^^");

        //Aufgebe a)
        System.out.println("Aufgabe a:");
        if (x == 5 && y == 8) {
            System.out.println("@@@@@");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        } else {
            System.out.println("#####");
        }

        //Aufgebe b)
        System.out.println("\nAufgabe b:");
        if (x == 5 && y == 8) {
            System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

        //Aufgebe c)
        System.out.println("\nAufgabe c:");
        if (x == 5 && y == 8) {
            System.out.println("@@@@@");
            System.out.println("&&&&&");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        //Aufgebe d)
        System.out.println("\nAufgabe d:");
        if (x == 5 && y == 8) {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        } else {
            System.out.println("@@@@@");
        }


    }
}
