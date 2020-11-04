package kap2;

import java.util.Scanner;

public class ProgU2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Bitte geben Sie eine Zahl dezimal ein");
        n = sc.nextInt();

        System.out.println("Hex: " + Integer.toHexString(n));
        System.out.println("Binär: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));

        System.out.println("Bitte geben Sie eine Zahl hexadezimal ein");
        n = sc.nextInt(16);

        System.out.println("Dezimal:" + n);
        System.out.println("Binär: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));

        System.out.println("Bitte geben Sie eine Zahl binär ein");
        n = sc.nextInt(2);

        System.out.println("Dezimal:" + n);
        System.out.println("Hex: " + Integer.toHexString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));

        System.out.println("Bitte geben Sie eine Zahl octal ein");
        n = sc.nextInt(8);

        System.out.println("Dezimal:" + n);
        System.out.println("Hex: " + Integer.toHexString(n));
        System.out.println("Binär: " + Integer.toBinaryString(n));

    }
}
