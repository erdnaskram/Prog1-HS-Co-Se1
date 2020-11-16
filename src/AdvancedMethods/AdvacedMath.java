package AdvancedMethods;

public class AdvacedMath {
    public static int factorial(int i) {
        int result = 0;
        for (int j = i; j > 0; j--) {
            result = result + j;
        }
        return result;
    }
}
