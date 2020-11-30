package tests;

import java.util.Arrays;
import java.util.Scanner;

public class test_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie einen Wert für die Zeilen und Spalten des Arrays an: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int counter = 0;

        int[][] original = new int[rows][cols];

        // initialize matrix by increment
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = counter++;
            }
        }

        // output original
        System.out.println("\nOriginal: ");
        for (int[] row : original)
            System.out.println(Arrays.toString(row));

        int[][] rotation = new int[cols][rows];

        // rotation of original
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(j + "v");
                rotation[j][i] = original[i][j];
                System.out.println(j);
            }
            System.out.println("Test" + i);
            for (int[] row : rotation)
                System.out.println(Arrays.toString(row));
        }

        // output rotation
        System.out.println("\nRotated:");
        for (int[] row : rotation)
            System.out.println(Arrays.toString(row));



    }
}
