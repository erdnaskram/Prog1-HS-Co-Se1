package tests;

public class test_014 {
    public static void main(String[] args) {
        int[][] a;
        a = new int[4][5];
        a[2][3] = 6;

        System.out.println(a[1].length);
        System.out.println(a[2][3]);
        if(++a[2][3] == 7) System.out.println("jay");
        a[2][3]++;
        System.out.println(a[2][3]);
    }
}
