package kap2;

import java.util.Scanner;

public class ProgU2_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        boolean result = false;

        System.out.println("\nMoin und Willkommen beim boolschen Rechner ^^"
                + "\nGeben sie einen Wert für a ein:");
        a = sc.nextInt();
        System.out.println("Geben sie einen Wert für b ein");
        b = sc.nextInt();
        System.out.println("Geben sie einen Wert für c ein");
        c = sc.nextInt();
        System.out.println("Geben sie einen Wert für d ein");
        d = sc.nextInt();
        
        //Aussage 1
        if (a>1 || b>1 || c>1 || d>1)
            result = true;
        System.out.println("Aufgabe 1: " + result);
        result = false;

        //Aussage 2
        int z = 0;
        if (a>1) z++;
        if (b>1) z++;
        if (c>1) z++;
        if (d>1) z++;
        if (z>1 && z<4)
            result = true;
        System.out.println("Aufgabe 2: " + result);
        result = false;
        z=0;
        
        
        //Aussage 3
        if (a<0) z++;
        if (b<0) z++;
        if (c<0) z++;
        if (d<0) z++;
        if (z == 1)
            result = true;
        System.out.println("Aufgabe 3: " + result);
        result = false;
        z=0;
        
        //Aussage 4
        int x = 0;
        if (a<0) z++;
        if (b<0) z++;
        if (c<0) z++;
        if (d<0) z++;
        if (a<10) x++;
        if (b<10) x++;
        if (c<10) x++;
        if (d<10) x++;
        if (z == x)
            result = true;
        System.out.println("Aufgabe 3: " + result);
        
        
    }
}
