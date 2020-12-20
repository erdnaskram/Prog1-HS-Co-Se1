package GI.Aufgabe4;

import java.time.LocalDateTime;

public class Zahlenpalindrome {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(einhundertneunundsechzig(50) + " " + LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(inefficientIteration(50) + " "+ LocalDateTime.now());
    }

    public static int umdrehen(int n, int nu){
        nu = nu*10 + n%10;
        int rest  = n/10;
        if (rest > 0){
            return umdrehen(rest,nu);
        } else {
            return nu;
        }
    }

    public static int einhundertneunundsechzig(int n){
        int zahlenpalindrom = n + umdrehen(n,0);
        int invert = umdrehen(zahlenpalindrom,0);

        if (zahlenpalindrom != invert){
            return einhundertneunundsechzig(zahlenpalindrom);
        } else {
            return zahlenpalindrom;
        }
    }

    public static int inefficientIteration(int n) {
        int zahlenpalindrom;
        int inf;
        do{
            zahlenpalindrom = n + umdrehen(n,0);
            n = zahlenpalindrom;
            inf = umdrehen(zahlenpalindrom,0);
        } while (zahlenpalindrom != inf);

        return zahlenpalindrom;
    }
}
