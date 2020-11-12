package kap2;


public class ProgU2_12 {
    public static void main(String[] args){
        double a;       // initialisierung von a als double
        int d;          // initialisierung von d als int
        a = 5;          // deklaration von a mit 5
        int b = 9;      // initialisierung von b als int & deklaration mit 9

        d = Integer.parseInt(args[0]);  // d wird der Startparameter args[0] zugewiesen
        double c;       // initialisierung von c als double

        System.out.println( "Input: " + d );    // der Startparameter args[0] der d zugewiesen wird hier ausgegeben

        c = a / b;      //teile a durch b und weiße das Ergebnis c zu - Ergebnis: 0 , da es zu int gecastet wird
        int h1 = 32;    // initialisierung von h1 als int & deklaration mit 32
        a = d - h1;     // ziehe h1 von d ab und weiße das Ergebnis a zu - Ergebnis: abhänig von der Startvariable
        a = a * c;      // Multipliziere a mit b und weiße des Ergebnis a zu - Ergebnis: abhänig von der Startvariable

        System.out.println("Output: " + a); // ausgabe von a - abhänig von der Startvariable
    }
}
