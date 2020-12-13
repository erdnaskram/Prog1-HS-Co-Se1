package kap4;

import java.util.Random;
import java.util.Scanner;

public class ProgU4_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int m = 0;
        boolean wrongIP;


        System.out.println("\nMoin und Willkommen beim Tabellenkalkulator 1000 ^^ ");
        do {
            wrongIP = false;
            System.out.println("\nGeben sie einen Zahl für die Zeilen ein:");
            try {
                n = sc.nextInt();
            } catch (Exception e){
                wrongIP = true;
                System.out.println("Falsche EIngabe bitte versuchen sie es erneut!");
            }
            if (!(2<n && n<20) && (n % 2 == 0)){
                wrongIP = true;
                System.out.println("Falsche EIngabe bitte versuchen sie es erneut!");
            }
        }while (wrongIP);


        int[][] quad = new int[n][n];
        int zeile = n/2;
        int spalte = n/2 + 1;

        while (m < Math.pow(n,2)){

            if (quad[zeile][spalte] != 0){
                zeile++;
                spalte++;
                if (zeile >= n) zeile = 0;
            }else{
                m++;
                quad[zeile][spalte] = m;
                zeile--;
                spalte++;
            if (zeile < 0) zeile = n-1;
            }
            if (spalte >= n) spalte = 0;
        }

        for (int[] ints : quad) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
