package tests;

public class test_013 {
    public static void main(String[] args) {
        Schüler t1 = new Schüler("Tim");
        Schüler t2 = new Schüler("Tom");
        Schüler t3 = new Schüler("Lisa");
        Schüler t4 = new Schüler("Franz");
        System.out.println(t3.getId());
        System.out.println(Schüler.getZähler());
        double t = 5;
        System.out.println(Double.isInfinite(t));

    }
}
