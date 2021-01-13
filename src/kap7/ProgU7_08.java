package kap7;

import java.util.Random;

public class ProgU7_08 {

    public static void main(String[] args) {

        Random random = new Random();
        String output;

        System.out.println("\nMoin und Willkommen beim Satzgenerator 1000 ^^");

        //Generierung der Arrays
        String[] article = {"the", "a" , "one", "some","any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped" , "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under" ,"on"};


        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(article.length);
            output = article[x].substring(0,1).toUpperCase() + article[x].substring(1);
            x = random.nextInt(noun.length);
            output += " " + noun[x];
            x = random.nextInt(verb.length);
            output += " " + verb[x];
            x = random.nextInt(preposition.length);
            output += " " + preposition[x];
            x = random.nextInt(article.length);
            output += " " + article[x];
            x = random.nextInt(noun.length);
            output += " " + noun[x] + ".";
            System.out.println(output);


        }

    }
}
