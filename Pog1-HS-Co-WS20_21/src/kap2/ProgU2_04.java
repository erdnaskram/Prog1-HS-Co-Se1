package kap2;

import java.util.Scanner;

public class ProgU2_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /* Input Variablen */
        byte tag;
        byte monat;
        int jahr;

        /* Variablen zur Verarbeitung*/
        byte jahrKurz;
        byte jahrhundert;
        byte wochentagIndex;
        String[] wochentage = new String[]{"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samsatg","Sonnatg"};

        System.out.println("\nMoin und Willkommen beim Wochentagsrechner ^^" + "\ngeb ein Datum im folgenden Format ein\nDD MM YYYY");
        tag = sc.nextByte();
        monat = sc.nextByte();
        jahr = sc.nextInt();

        jahrhundert = (byte) (jahr/100);
        jahrKurz = (byte) (jahr-jahrhundert*100);
        wochentagIndex = (byte) (Math.floorMod((tag+(26*(monat+1))/10+(5*jahrKurz)/4+jahrhundert/4+5*jahrhundert-1),7));

        System.out.println(wochentage[wochentagIndex - 1]);

        int a=6;
        int b=4;

        double z  = 24.0;
        z = (double) a/b;
        System.out.println("z = " + z);
    }
}
