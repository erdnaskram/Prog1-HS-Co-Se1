package kap7;

import AdvancedMethods.AdvacedMath;
import java.util.Scanner;

public class ProgU7_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result;

        System.out.println("\nMoin und Willkommen beim String ?!?! basierten Taschenrechner ^^ "
                + "\nsorry darf nur addieren und multiplizieren" + "\n\n\nJust kidding... natürlich kann ich auch mehr");
         String[] rechnung = sc.nextLine().split(" ");

        switch (rechnung[1]){
            case "+": result = Integer.parseInt(rechnung[0]) + Integer.parseInt(rechnung[2]);
                break;

            case "-": result = Integer.parseInt(rechnung[0]) - Integer.parseInt(rechnung[2]);
                break;

            case "*": result = Integer.parseInt(rechnung[0]) * Integer.parseInt(rechnung[2]);
                break;

            case "/": result = Integer.parseInt(rechnung[0]) / Integer.parseInt(rechnung[2]);
                break;

            case "^": result = Integer.parseInt(rechnung[0]);
                for (int i = 0; i < Integer.parseInt(rechnung[2])-1; i++) {
                    result *= Integer.parseInt(rechnung[0]);
                }
                break;

            case "!": if(rechnung.length > 2){
                result = (int) AdvacedMath.factorial(Integer.parseInt(rechnung[0]));
            } else {
                result = (int) AdvacedMath.specialFactorial(Integer.parseInt(rechnung[0]),Integer.parseInt(rechnung[2]));
            }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + rechnung[1]);
        }

        System.out.println(result);

    }
}
