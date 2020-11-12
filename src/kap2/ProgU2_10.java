package kap2;

import java.util.Random;

public class ProgU2_10 {
    public static void main(String[] args) {
        Random random = new Random();

        int x = 0;
        int y = 5;
        int z = 0;

        //Aufgabe 1
        System.out.println("Aufgabe 1:");
        System.out.println("x-Startwert: = " + x);
        x++;
        System.out.println("x = " + x);
        x = ++x;
        System.out.println("x = " + x);
        x = x+1;
        System.out.println("x = " + x);
        x = Math.addExact(x,1);
        System.out.println("x = " + x);


        //Aufagebe 2
            //a)
        System.out.println("\nAufgabe 2:");
        System.out.println("a)");
        z = x++ + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

            //b)
        System.out.println("\nb)");
        int count = random.nextInt(20);
        if (count > 10)
            System.out.println("Count is greater than 10 -> " + count);
        else
            System.out.println("Count is not greater than 10 -> " + count);

            //c)
        System.out.println("\nc)");
        int total = random.nextInt(20);
        x--;
        total = total - x;
        System.out.println("total = " + total);
        System.out.println("x = " + x);

            //d)
        System.out.println("\nd)");
        int q = random.nextInt(100);
        int divisor = random.nextInt(10);
        System.out.println("q = " + q);
        System.out.println("divisor = " + divisor);
        q = q%divisor;
        System.out.println("Ergebnis = " + q);

        q = random.nextInt(100);
        divisor = random.nextInt(10);
        System.out.println("\nq = " + q);
        System.out.println("divisor = " + divisor);
        q = Math.floorMod(q,divisor);
        System.out.println("Ergebnis = " + q);

    }
}
