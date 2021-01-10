package kap5.a1;

public class Employee {
    public static void main(String[] args) {

        Employee a = new Employee("Chris Müller");
        Employee b = new Employee("Chris Hans Müller");
        Employee c = new Employee("Max Emil hans Müller");
        Employee d = new Employee("Lars Boogener");
        Employee e = new Employee("Franz Büttner");
        Employee f = new Employee("Franz Büttner");
        Employee g = new Employee("Franz Büttner");
        Employee h = new Employee("Franz Büttner");
        Employee i = new Employee("Chris Hans Klaus  Müller");
        Employee j = new Employee("Martin Emil hans Müller");
        Employee k = new Employee("Lars Boogener");
        Employee l = new Employee("Franz Büttner");
        Employee m = new Employee("Franz Büttner");
        Employee n = new Employee("Franz Büttner");
        Employee o = new Employee("Franz Büttner");

        System.out.println("\nMoin und Willkommen bei der Klasse Employee ^^");
        System.out.println("Employees:");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

    }

    public static int anzahl;
    public String firstName;
    public String lastName;

    public Employee(String name) {
        anzahl++;
        String[] names = name.split(" ");
        for (int i = 0; i < names.length-1; i++) {
            if (i == 0) {
                firstName = names[i];
            } else {
                firstName += " " + names[i];
            }
        }
        lastName = names[names.length-1];
    }

    public int getCount(){
        return anzahl;
    }

    public String toString(){
        return firstName + " " + lastName + "\nAnzanl: " + anzahl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
