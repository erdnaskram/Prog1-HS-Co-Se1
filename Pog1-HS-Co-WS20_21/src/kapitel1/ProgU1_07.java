package kapitel1;

public class ProgU1_07 {
    public static void main(String[] args)  {
        int n = Integer.parseInt(args[0]);
        int result = 0;

        int counter = 4;
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
