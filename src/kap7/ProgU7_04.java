package kap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProgU7_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int counter = 0;

        System.out.println("\nMoin und Willkommen beim Stringsplitter ^^ "
                + "\nGeben sie einen Satz ein:");
        String line = sc.nextLine();

        System.out.println("\nGeben sie eine Char ein:");
        char letter = sc.next().charAt(0);

        for (int i = 0; i < line.length(); i++) {
            a= line.indexOf(letter, i);
            if(a  != -1){
                i = a;
                counter++;
            } else {
                i = line.length();
            }
        }

        System.out.println("Dein Char \"" + letter + "\" wurde " + counter +" mal gefunden.");

    }
}
