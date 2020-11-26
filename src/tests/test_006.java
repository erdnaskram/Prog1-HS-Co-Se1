package tests;

import AdvancedMethods.AdvacedMath;
import AdvancedMethods.Combinatorics;

public class test_006 {
    public static void main(String[] args) {

        int i = 50;
        int res = (int) AdvacedMath.factorial(i);
        System.out.println("res = " + res);

        res = (int) AdvacedMath.specialFactorial(4, 2);
        System.out.println("res = " + res);

        res = (int) Combinatorics.kombinationOw(50, 2);
        System.out.println("res = " + res);

        res = (int) Combinatorics.kombinationMw(12, 10);
        System.out.println("res = " + res);

        res = (int) Combinatorics.kombinationMw(3, 6);
        System.out.println("res = " + res);

        res = (int) Combinatorics.variationOw(12, 9);
        System.out.println("res = " + res);

        res = (int) Combinatorics.permutationOw(8);
        System.out.println("res = " + res);

        res = (int) Combinatorics.variationOw(60,2);
        System.out.println("res = " + res);

        res = (int) (AdvacedMath.specialFactorial(60,30)/Math.pow(2,30));
        System.out.println("res = " + res);




    }
}
