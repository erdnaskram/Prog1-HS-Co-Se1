package kap2;

public class ProgU2_17 {
    public static void main(String[] args) {

        int prim = 1000;
        boolean realPrim = true;

        while (prim != 0) {
            for (int i = prim-1;i > 1; i--){
                if (prim%i == 0){
                    realPrim = false;
                    i = 0;
                }
            }

            if (realPrim)
                System.out.println("Primzahl: " + prim);

            prim --;
            realPrim = true;
        }

        
        
    }
}
