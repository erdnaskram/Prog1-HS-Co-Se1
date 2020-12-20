package tests;

public class test_011 {
    public static void main(String[] args) {
        System.out.println(umdrehen(198,0));
    }

    public static int umdrehen(int n, int nu) {
        nu = (nu * 10) + (n % 10);
        int rest = n / 10;

        if (rest > 0)
            return umdrehen(rest, nu);
        else
            return nu;

    }
}
