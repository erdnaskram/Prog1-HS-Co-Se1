package kap3;


public class ProgU3_14 {
    public static void main(String[] args) {

        System.out.println("Alle pythagoräischen Zahlen");

        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= 500; b++) {
                for (int c = 1; c <= 500; c++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
//                        System.out.println("a " + a + " b: " + b +  " c: " + c);
                        /*
                        Folgender Block ist nur dafür dass die Ausgabe schöner aussieht, könnte aber auch durch die
                        obere Zeile ersetzt werden.
                         */
                        System.out.print("a: " + a);
                        for (int i = 0; i < 3-Integer.toString(a).length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print(" b: " + b);
                        for (int i = 0; i < 3-Integer.toString(b).length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print(" c: " + c);
                        for (int i = 0; i < 3-Integer.toString(c).length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.println();

                    }
                }
            }
        }

    }
}
