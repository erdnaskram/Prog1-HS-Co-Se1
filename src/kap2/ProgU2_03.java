package kap2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProgU2_03 {
    public static void main(String[] args) {
        int einePostLeitzahl = 96106;
        String eineKartiekarte = "a";
        BigDecimal pi = new BigDecimal(Math.PI);
        String einStrassenname = "Müller Gasse";
        byte eineRaumNummer = 110;
        boolean einLichtSchalter = true;
        byte dieAusentemperatur = 20;
        byte dasStockwerk = 5;
        BigInteger eineISBNNummer = new BigInteger("9783527709953");
        String derAutor = "Barry Burd";


        System.out.println("einePostLeitzahl = \t\t" + einePostLeitzahl);
        System.out.println("eineKartiekarte = \t\t" + eineKartiekarte);
        System.out.println("pi = \t\t\t\t\t" + pi);
        System.out.println("einStrassenname = \t\t" + einStrassenname);
        System.out.println("eineRaumNummer = \t\t" + eineRaumNummer);
        System.out.println("einLichtSchalter = \t\t" + einLichtSchalter);
        System.out.println("dieAusentemperatur = \t" + dieAusentemperatur);
        System.out.println("dasStockwerk = \t\t\t" + dasStockwerk);
        System.out.println("eineISBNNummer = \t\t" + eineISBNNummer);
        System.out.println("derAutor = \t\t\t\t" + derAutor);

    }
}
