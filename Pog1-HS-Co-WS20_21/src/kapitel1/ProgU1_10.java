package kapitel1;

import java.util.Scanner;

public class ProgU1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int result = 0;
        int counter = 4;

        System.out.println("\nMoin und Willkommen beim Matherechner ^^" + "\ngeb ma ne Zahl ein");
        n = sc.nextInt();

        if (n <= 3){
            result = 1;
        } else {
            result = 3;
            while(counter <= n) {
                result = result * counter;
                counter = counter + 1;
            }
        }
        System.out.println(result);
    }
}
