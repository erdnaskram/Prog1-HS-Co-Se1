package kap3;

import java.util.Scanner;

public class ProgU3_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bedingung = sc.nextBoolean();
        int wert = sc.nextInt();
        int i;
        i = 1;
        while(i < 10){
            System.out.println(i);
        }
        i = i + 1;
        while(bedingung == true){
            System.out.println("Bedingung ist wahr");
        }
        
        if(wert == 0){
            System.out.println("Wert ist 0");
        }else if(wert == 1){
            System.out.println("Wert ist 1");
        }else if(wert == 2){
            System.out.println("Wert ist 2");
        }else {
            System.out.println("Wert ist weder 0, noch 1, noch 2");
        }
    }
}
