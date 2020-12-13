package tests_fuer_Vorlesungen;



import java.util.Arrays;

public class test_008 {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 20;

        float[] fractions = new float[ARRAY_SIZE];

        for (int i = 0; i < fractions.length; i++) {
            fractions [i] = i;
        }

        fractions[3] = 5.4f;
        fractions[fractions.length - 1] = 5.3f;

        float sum = 0;

        for (float f: fractions) {
            sum += f;
        }

        System.out.println("sum = " + sum);
        System.out.println(Arrays.toString(fractions));
    }
}
