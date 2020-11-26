package Vorlesung_Tutorials;

import java.util.Arrays;

public class ProgT04_01 {

    public static void main(String[] args) {

        char[] c = {'a','b','c','d'};
        char[] d = {'x','y'};

        char[] exchange;

        exchange = c;
        c=d;
        d=exchange;

        System.out.println("c = " + Arrays.toString(c));
        System.out.println("d = " + Arrays.toString(d));

    }
}
