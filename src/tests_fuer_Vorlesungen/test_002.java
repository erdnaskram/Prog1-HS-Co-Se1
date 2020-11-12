package tests_fuer_Vorlesungen;

public class test_002 {
    public static void main(String[] args) {
        int res =9, oft = 0;

        for (int cnt=2; cnt<res; cnt+=3)
            res=cnt;

        System.out.println("res = " + res);
    }
}
