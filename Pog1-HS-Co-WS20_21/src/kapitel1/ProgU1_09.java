package kapitel1;

public class ProgU1_09 {
    public static void main(String[] args)  {
        int x = Integer.parseInt(args[0]);

        int x2;
        int x3;

        System.out.println(">Zahl \tQadrat\tKubisch");
        System.out.println("======================================");

        for (int i = 1; i < x+1; i++){
            x2 = i*i;
            x3 = i*i*i;
            System.out.println(">" + i + "\t\t" + x2 + "\t\t" + x3);
        }

    }
}
