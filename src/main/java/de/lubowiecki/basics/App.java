package de.lubowiecki.basics;

public class App {

    public static void main(String[] args) {

        // Variablen sind ab ihrer Deklaration (Vorstellung) bis zum Ende der Methode verfügbar
        int a = 10; // Variable
        final int b = 15; // Konstante (kann nachträglich nicht mehr geändert werden)

        // b muss nicht noch mal deklariert werden, da sie bereits als int-Variable bekannt ist
        // b = 20; // Kompilererror, Konstante kann nicht geändert werden

        int c = 0; // in eine primitive Variable passt nur ein Wert rein
        c = a + b; // Alter Wert von a wird überschrieben

        // System = Klasse
        // out = statische Eigenschaft der Klasse. Zeiger auf den Ausgabestrom
        // println ist eine Methode des Ausgabestroms
        System.out.println(a);

        // System.in = Eingabestrom (Eingabe in die Konsole)
        // System.out = Ausgabestrom (Ausgabe in die Konsole)

        System.out.println(); // Leerzeile

        String person1 = "Peter, Parker, 25";
        // String person1 = new String("Peter, Parker, 25");
        String[] person2 = {"Peter", "Parker", "25"};
        System.out.println(person2[0]);

        // Bei Variablen komplexer Datentypen arbeitet man mit Objekten.
        // Diese werden mit new erzeugt
        Person person3 = new Person("Peter", "Parker", 25); // Erzeugt ein leeres Objekt
//        person3.vorname = "Peter";
//        person3.nachname = "Parker";
//        person3.alter = 25;

        //System.out.println(person3.vorname + " " + person3.nachname);
        person3.printInfo(); // Ruft die Methode von dem Objekt hinter person3 auf

        Person person4 = new Person("Bruce", "Banner", 35);
        person4.printInfo(); // Ruft die Methode von dem Objekt hinter person4 auf

    } // Hier endet das Programm
}