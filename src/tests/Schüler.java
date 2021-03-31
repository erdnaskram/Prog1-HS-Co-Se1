package tests;

public class Schüler {

    static int zähler = 0;

    String name;
    int id;

    public Schüler(String name){
        this.name=name;
        zähler++;
        id = zähler;
    }

    public static int getZähler() {
        return zähler;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
