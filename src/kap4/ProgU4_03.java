package kap4;

public class ProgU4_03 {
    public static void main(String[] args) {

        int [] a = {2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756, 999, 0, 666, 2345, 7492, 22};
        int temp;
        boolean low = true;

        System.out.println("\nMoin und Willkommen beim Array Sorter ^^");
        System.out.println("Data items in original order");
        for (int t : a) {
            System.out.print(t + "  ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Data items in ascending order");
        for (int t : a) {
            System.out.print(t + "  ");
        }


    }
}
