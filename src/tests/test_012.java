package tests;

public class test_012 {
    public static void main(String[] args) {

        int n = 88;
        System.out.println("Die Anfangszahl " + n);
        einsneunsechs(n);

    }

    public static void einsneunsechs(int n0) {
        int n0u = umdrehen(n0, 0);
        int n1 = n0 + n0u;
        if (isPalindrom(Integer.toString(n1))) {
            System.out.println("ist das Palindrom " + n1);
        } else {
            int n1u = umdrehen(n1, 0);
            int n2 = n1 + n1u;
            if (isPalindrom(Integer.toString(n2))) {
                System.out.println("ist das Palindrom " + n2);
            } else
                einsneunsechs(n2);
        }
    }

    public static boolean isPalindrom(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
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
