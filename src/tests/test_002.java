package tests;

public class test_002 {
    public static void main(String[] args) {
        int res =9, oft = 0;

        for (int cnt=2; cnt<res; cnt+=3)
            res=cnt;

        System.out.println("res = " + res);

        float f = (float) 3.5;

        System.out.println((int) f);

        String[] test = {"m", "n"};
        String a = test[0];
        test[0] = "b";
        System.out.println("a = " + a);

    }
}
