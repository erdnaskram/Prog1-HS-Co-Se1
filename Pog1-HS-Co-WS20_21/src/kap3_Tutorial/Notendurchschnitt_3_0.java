package kap3_Tutorial;

import java.util.Scanner;

public class Notendurchschnitt_3_0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pointsOfOneStudent = 0;
        int gradeOfOneStudent = 0;
        int currentSumOfAllStudents = 0;
        double average;
        int counter = 0;

        while (pointsOfOneStudent != -1) {
            System.out.println("Geben sie dei Punktzahl ein (0-100)");
            pointsOfOneStudent = sc.nextInt();

            if (pointsOfOneStudent != -1) {
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
                } else {
                    gradeOfOneStudent = 1;
                }
            System.out.println("gradeOfOneStudent = " + gradeOfOneStudent);

                currentSumOfAllStudents = currentSumOfAllStudents + gradeOfOneStudent;
            }

            counter++;
        }

        average = (double) currentSumOfAllStudents / counter;
        System.out.println("average = " + average);


    }
}
