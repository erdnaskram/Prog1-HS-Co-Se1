package kap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgU7_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("\nMoin und Willkommen beim wählerischem Wortausgeber ^^ "
                + "\nGeben sie einen Satz ein:");
         String[] satz = sc.nextLine().split(" ");

        for (int j = 0; j < satz.length; j++) {
            String wort = satz[j];

            if (wort.substring(0,1).equalsIgnoreCase("b")){
                stringList.add(wort);
            }
        }

        if(!stringList.isEmpty()){
            for (String s : stringList) {
                System.out.println(s);
            }
        }else {
            System.out.println("no Strings found");
        }

    }
}
