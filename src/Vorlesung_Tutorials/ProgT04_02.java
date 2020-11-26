package Vorlesung_Tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class ProgT04_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zeilen =0;
        int splaten =0;
        int z = 0;


        System.out.println("\nMoin und Willkommen beim Array Rechner Rechner ^^"
                + "\nGeben sie einen Zahl für die Zeilen ein:");
        zeilen = sc.nextInt();

        System.out.println("\nGeben sie einen Zahl für die Zeilen ein:");
        splaten = sc.nextInt();

        //Generierung der Arrays
        int[][] defaultArray = new int [zeilen] [splaten];
        int[][] rotadeArray = new int [splaten] [zeilen];

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < splaten; j++) {
                defaultArray[i][j] = z;
                rotadeArray[j][i] = z;
                z++;
            }
        }

        //Ausgabe
        System.out.println("defaultArray = " + Arrays.toString(defaultArray));
        for (int[] row:defaultArray) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("rotadeArray = " + Arrays.toString(rotadeArray));
        for (int[] row:rotadeArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
