package kap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProgU7_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tmp;
        int length;

        System.out.println("\nMoin und Willkommen beim Stuchbaben verdreher ^^ "
                + "\nGeben sie einen Satz ein:");
         String[] satz = sc.nextLine().split(" ");

        for (int j = 0; j < satz.length; j++) {
            String wort = satz[j];
            length = wort.length();

            if(length > 3){
                StringBuffer stringBuffer= new StringBuffer(wort.substring(0,1));

                for (int i = length-2; i >= length/2+1; i--) {
                    stringBuffer.append(wort.substring(i,i+1));
                }

                for (int i = length/2; i >= 1; i--) {
                    stringBuffer.append(wort.substring(i,i+1));
                }

                stringBuffer.append(wort.substring(length-1));

                satz[j] = stringBuffer.toString();
            }
        }

        System.out.println("Satz: \n");
        for (String s : satz) {
            System.out.print(s + " ");
        }

    }
}
