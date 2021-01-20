package Klausurenvorbereitung.a12;

public class Reisen {

    protected final int preis;
    protected final int dauer;
    protected final String ziel;
    protected final String beginn;
    protected boolean gebucht;


    public Reisen(int preis, int dauer, String zeil, String beginn) {
        this.preis = preis;
        this.dauer = dauer;
        this.ziel = zeil;
        this.beginn = beginn;
        gebucht = false;
    }

    public String istGebucht(){
        String status = "nein";
        if (gebucht) status = "ja";
        return status;
    }

    @Override
    public String toString() {
        return "Zeil: " + ziel + ", Preis: " + preis + "€ \nBeginn: " + beginn + " Dauer: " + dauer + "Wo\nGebucht: " + istGebucht();
    }

    public int getPreis() {
        return preis;
    }

    public int getDauer() {
        return dauer;
    }

    public String getZeil() {
        return ziel;
    }

    public String getBeginn() {
        return beginn;
    }

    public void setGebucht(boolean gebucht) {
        this.gebucht = gebucht;
    }
}
