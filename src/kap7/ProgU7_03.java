package kap7;

import java.util.*;

public class ProgU7_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer stringTokenizer;
        List<String> stringList = new ArrayList<>();

        System.out.println("\nMoin und Willkommen beim Stringsplitter ^^ "
                + "\nGeben sie einen Satz ein:");
        String line = sc.nextLine();

        stringTokenizer = new StringTokenizer(line);
        while (stringTokenizer.hasMoreTokens()) {
            stringList.add(stringTokenizer.nextToken());
        }

        for (int i = stringList.size()-1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }


        System.out.println("\nUnd hier kommt auch scho der zwote Teil vom Stringsplitter ^^ "
                + "\nGeben sie einen Staz ein:");
        String[] stringArray = sc.nextLine().split(" ");

        stringTokenizer = new StringTokenizer(line);
        while (stringTokenizer.hasMoreTokens()) {
            stringList.add(stringTokenizer.nextToken());
        }

        for (int i = stringArray.length -1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }



    }
}
