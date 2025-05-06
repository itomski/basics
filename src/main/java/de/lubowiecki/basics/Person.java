package de.lubowiecki.basics;

// Jede Klasse ist ein neuer eigener Datentyp
// Dieser Typ ist "komplex", weil er eine Sammlung verschiedener Informationen ist
public class Person {

    String vorname;
    String nachname;
    int alter;
    boolean aktiv;

    // Konstruktor-Methode
    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.aktiv = true;
    }

    public void printInfo() {
        System.out.println(vorname + " " + nachname);
    }
}

