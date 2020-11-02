package Tutorial;

import java.util.Scanner;

public class Notendurchschnitt_4_0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pointsOfOneStudent = 0;
        int gradeOfOneStudent = 0;
        int currentSumOfAllStudents = 0;
        double average;
        int counter = 0;

        while (pointsOfOneStudent != -1) {
            System.out.println("Geben sie dei Punktzahl ein (0-100):");
            try {
                pointsOfOneStudent = sc.nextInt();
            } catch (Exception e) {
               pointsOfOneStudent = -2;
               sc.reset();
               sc.close();
            }

            if (pointsOfOneStudent >= 0 && pointsOfOneStudent <= 100) {
                if (pointsOfOneStudent < 23) {
                    gradeOfOneStudent = 6;
                } else if (pointsOfOneStudent < 50) {
                    gradeOfOneStudent = 5;
                } else if (pointsOfOneStudent < 67) {
                    gradeOfOneStudent = 4;
                } else if (pointsOfOneStudent < 81 ) {
                    gradeOfOneStudent = 3;
                } else if (pointsOfOneStudent < 92) {
                    gradeOfOneStudent = 2;
                } else if (pointsOfOneStudent <= 100){
                    gradeOfOneStudent = 1;
                }

                switch (gradeOfOneStudent) {
                    case 1:
                        System.out.println("Note: " + gradeOfOneStudent + " Super!! Dein Lehrer erhält einen Bonus!");
                        break;
                    case 2:
                        System.out.println("Note: " + gradeOfOneStudent + " Gut gemacht");
                        break;
                    case 3:
                        System.out.println("Note: " + gradeOfOneStudent + " Weiter so! Schau di rnochmal deine Fehler an");
                        break;
                    case 4:
                        System.out.println("Note: " + gradeOfOneStudent + " Das kann man noch verbessern");
                        break;
                    case 5:
                        System.out.println("Note: " + gradeOfOneStudent + " Das musst du wohl nochmal schreiben");
                        break;
                    case 6:
                        System.err.println("Note: " + gradeOfOneStudent + " Ohne Worte.");
                        break;

                    default:
                        //nothing
                        break;
                }
                currentSumOfAllStudents = currentSumOfAllStudents + gradeOfOneStudent;
                counter++;

            } else if (pointsOfOneStudent == -1){
                System.out.println("Ende");
            } else {
                System.err.println("ERROR");
               // pointsOfOneStudent = null;
            }

        }

        average = (double) currentSumOfAllStudents / counter;
        System.out.println("average = " + average);


    }
}
