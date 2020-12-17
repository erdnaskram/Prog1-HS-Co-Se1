package tests;

public class test_011 {
    public static void main(String[] args) {

    }

    public static int umdrehen(int n, int nu) {
        int rest = 0;
        nu = (nu * 10) + (n % 10);
        rest = n / 10;

        if (rest > 0)
            return umdrehen(rest, nu);
        else
            return nu;

    }
}
