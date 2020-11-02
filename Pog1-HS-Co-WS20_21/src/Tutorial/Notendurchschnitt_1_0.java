package Tutorial;

import java.util.Scanner;

public class Notendurchschnitt_1_0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pointsOfOneStudent = 0;
        int currentSumOfAllStudents = 0;
        double average;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Geben sie dei Punktzahl ein");
            pointsOfOneStudent = sc.nextInt();
            currentSumOfAllStudents = currentSumOfAllStudents + pointsOfOneStudent;
            counter++;
        }

        average = (double) currentSumOfAllStudents / 10;
        System.out.println("average = " + average);


    }
}
