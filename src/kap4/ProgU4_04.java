package kap4;

import java.util.Random;
import java.util.Scanner;

public class ProgU4_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lines;
        int columns;
        int max = 0;
        String space = "";


        System.out.println("\nMoin und Willkommen beim Tabellenkalkulator 1000 ^^"
                + "\nGeben sie einen Zahl für die Zeilen ein:");
        lines = sc.nextInt();

        System.out.println("\nGeben sie einen Zahl für die Spalten ein:");
        columns = sc.nextInt();

        //Generierung der Arrays
        int[][] defaultArray = new int[lines][columns];
        int[] vertikal = new int[lines];
        int[] horizontal = new int[columns];


        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                defaultArray[i][j] = random.nextInt(9);
            }
        }


        for (int i = 0; i < lines; i++) {
            int z = 0;
            for (int j = 0; j < columns; j++) {
                z += defaultArray[i][j];
            }
            vertikal[i] = z;
        }

        for (int i = 0; i < columns; i++) {
            int z = 0;
            for (int j = 0; j < lines; j++) {
                z += defaultArray[j][i];
            }
            horizontal[i] = z;
        }


        for (int i : horizontal) {
            if (i > max) max = i;
        }
        for (int i = 0; i < String.valueOf(max).length(); i++) {
            space = space + " ";
        }
        int breite = columns*(1+space.length());


        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(defaultArray[i][j] + space);
            }
            System.out.print("| " + vertikal[i] + "\n");
        }
        for (int i = 0; i < breite; i++) {
            System.out.print("-");
        }
        System.out.print("+\n");
        for (int sum : horizontal) {
            System.out.print(sum + " ");
            if (sum/10 < 1){
                System.out.print(" ");
            }
        }
    }
}
