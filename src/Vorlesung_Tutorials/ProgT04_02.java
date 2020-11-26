package Vorlesung_Tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class ProgT04_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines;
        int columns;
        int z = 0;


        System.out.println("\nMoin und Willkommen beim Array Rechner Teil 2 Rechner ^^"
                + "\nGeben sie einen Zahl für die Zeilen ein:");
        lines = sc.nextInt();

        System.out.println("\nGeben sie einen Zahl für die Zeilen ein:");
        columns = sc.nextInt();

        //Generierung der Arrays
        int[][] defaultArray = new int[lines][columns];
        int[][] rotateArray = new int[columns][lines];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                defaultArray[i][j] = z;
                rotateArray[j][i] = z;
                z++;
            }
        }

        //Ausgabe
        System.out.println("defaultArray: ");
        for (int[] row : defaultArray) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("rotateArray: ");
        for (int[] row : rotateArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
