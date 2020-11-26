package tests;

public class test_005 {
    public static void main(String[] args) {

        int i = 50;
        int res = 0;

        for (int j = i; j > 0; j--) {
            res = res + j;
        }

        System.out.println("res = " + res);
        System.out.println(51*25);

        int z = 0;
        int max = 2;
        for (int f = 0; f < max; f++) {
            for (int g = 0; g < max; g++) {
                for (int h = 0; h < max; h++) {
                    z++;
                    System.out.println(f + "" + g+ "" + h + "\t\t" +z);
                }
            }
        }
        System.out.println("z = " + z);
        System.out.println(Math.pow(6,3));
    }
}
