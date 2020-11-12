package kap2;

import java.util.Random;

public class ProgU2_11 {
    public static void main(String[] args) {
        Random random = new Random();

        int zaehler = 14;
        int nenner = 4;
        float quotient;

        //a)
        System.out.println("a)");
        quotient = zaehler/nenner;
        System.out.println("zaehler = " + zaehler);
        System.out.println("nenner = " + nenner);
        System.out.println("quotient = " + quotient);

        //b)
        System.out.println("\nc)");
        quotient = (float) zaehler/nenner;
        System.out.println("zaehler = " + zaehler);
        System.out.println("nenner = " + nenner);
        System.out.println("quotient = " + quotient);

        //c)
        System.out.println("\nc)");
        System.out.println("Zaehler casting");
        quotient = ((float) zaehler)/nenner;
        System.out.println("zaehler = " + zaehler);
        System.out.println("nenner = " + nenner);
        System.out.println("quotient = " + quotient);

        System.out.println("\nNenner casting");
        quotient = ((float) zaehler)/nenner;
        System.out.println("zaehler = " + zaehler);
        System.out.println("nenner = " + nenner);
        System.out.println("quotient = " + quotient);

    }
}
