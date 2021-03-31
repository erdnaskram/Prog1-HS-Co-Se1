package tests;

import java.util.Random;

public class test_015 {
    public static void main(String[] args) {
        Random random = new Random();
        double s = Math.random();
        int t = random.nextInt(9);
        double u = random.nextGaussian()*10;

        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("u = " + u);
    }
}
