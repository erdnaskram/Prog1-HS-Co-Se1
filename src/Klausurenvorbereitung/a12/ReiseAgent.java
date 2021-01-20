package Klausurenvorbereitung.a12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReiseAgent {
    protected int n;
    List<Reisen> reisen = new ArrayList<>();

    Random random = new Random();

    String[] ziele = {"NewYork", "Rio", "Berlin", "München", "Rom", "Coburg", "Hamburg", "Bremen", "Timmendorf", "Sydney"};

    public ReiseAgent(int n) {
        this.n = n;
        LocalDate ld = LocalDate.now();
        for (int i = 0; i < n; i++) {
            reisen.add(new Reisen(random.nextInt(10)*100+random.nextInt(10)*10,
                    random.nextInt(10),
                    ziele[random.nextInt(ziele.length)], ld.plusDays( 10 + random.nextInt(50)).toString()));
        }
    }


    public String buchen(String ziel, String beginn){
        String gebucht = null;
        for (Reisen reisen1 : reisen) {
            if (reisen1.getZeil().equals(ziel) && reisen1.beginn.equals(beginn) && !reisen1.gebucht){
                gebucht = reisen1.toString();
            }
        }
        return gebucht;
    }


    public void stonieren(String ziel, String beginn){
        for (int i = 0; i < reisen.size(); i++) {
            if (reisen.get(i).getZeil().equals(ziel) && reisen.get(i).beginn.equals(beginn) && reisen.get(i).gebucht){
                reisen.get(i).setGebucht(false);
            }
        }
    }


    @Override
    public String toString() {
        String string = "";
        for (Reisen reisen1 : reisen) {
            string += reisen1.toString() + "\n\n";
        }
        return string;
    }
}
