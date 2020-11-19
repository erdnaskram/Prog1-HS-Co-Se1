package tests_fuer_Vorlesungen;

import AdvancedMethods.AdvacedMath;

public class test_007 {
    public static void main(String[] args) {

        int k = 12;
        int n = 9;
        int res = (int) (AdvacedMath.factorial(n)/(AdvacedMath.factorial(k)*AdvacedMath.factorial(n-k)));
        System.out.println("res = " + res);


    }
}
