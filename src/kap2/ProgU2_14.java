package kap2;

import java.util.Scanner;
import java.util.stream.LongStream;

public class ProgU2_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n;

        System.out.println("\nMoin und Willkommen beim Fakultätrechner ^^"
                + "\nGeben sie einen Wert für n ein:");
        n = sc.nextInt();

        n = LongStream.rangeClosed(1, n)
                    .reduce(1, (long x, long y) -> x = x *  y);

        System.out.println("n = " + n);

    }
}
