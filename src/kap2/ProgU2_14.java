package kap2;

import AdvancedMethods.AdvacedMath;

import java.util.Scanner;
import java.util.stream.LongStream;

public class ProgU2_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n;
        float f;
        int z;

        System.out.println("\nMoin und Willkommen beim Fakultätrechner ^^"
                + "\nGeben sie einen Wert für n ein:");
        z = sc.nextInt();

        System.out.println("Lösung mit Stream:");
        n = LongStream.rangeClosed(1, z)
                    .reduce(1, (long x, long y) -> x = x *  y);

        System.out.println("n = " + n);

        System.out.println("\nLösung mit For-Schleife/AdvancedMath.factorial:");
        n = AdvacedMath.factorial(z);

        System.out.println("n = " + n);
        f = (float) n;
        System.out.println(f);

    }
}
