import uebung2.Person;
import static uebung2.Methoden.*;

import java.util.ArrayList;
import java.util.List;


public class Main2 {


    public static void main(String[] args) {
        // Erstelle eine Liste von Personen
        List<Person> personList = createPersonList();

        // Berechne den Durchschnitt des Alters aller Personen
        double averageAge = calculateAverageAge(personList);
        System.out.println("Durchschnittliches Alter: " + averageAge);

        // Finde die älteste Person
        Person oldestPerson = findOldestPerson(personList);
        System.out.println("Älteste Person: " + oldestPerson.getName() + ", Alter: " + oldestPerson.getAge());

        // Filtere Personen, die jünger als 30 Jahre sind
        List<Person> youngerThan30 = filterPersonsYoungerThan30(personList);
        System.out.println("Personen jünger als 30:");
        for (Person person : youngerThan30) {
            System.out.println(person.getName() + ", Alter: " + person.getAge());
        }
    }

    // Erstellt eine Liste von Personen
    public static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Doe", 25));
        personList.add(new Person("Emily", "Winters", 30));
        personList.add(new Person("Oliver", "Schrader", 28));
        personList.add(new Person("Sophia", "Lewis", 33));
        personList.add(new Person("Liam", "Neeson", 24));
        personList.add(new Person("Ava", "Maria", 29));
        return personList;
    }


//    Führe die folgenden Aufgaben aus:
//
//    Ergänze den fehlenden Code in der Klasse Person, um den Nachnamen jeder Person abzurufen (getLastName()).
//    Füge dann einen Nachnamen für jede Person in der Methode createPersonList() hinzu.
//
//    Implementiere die Methode calculateAverageAge(List<Person> personList), um den Durchschnitt des Alters
//    aller Personen in der Liste zu berechnen. Gib den Durchschnittswert als `

}
