package uebung2;

import java.util.ArrayList;
import java.util.List;

public class Methoden {
    // Berechnet den Durchschnitt des Alters aller Personen
    public static double calculateAverageAge(List<Person> personList) {
        int sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        return (double) sum / personList.size();
    }

    // Findet die älteste Person in der Liste
    public static Person findOldestPerson(List<Person> personList) {
        Person oldestPerson = null;
        int maxAge = Integer.MIN_VALUE;
        for (Person person : personList) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    // Filtert Personen, die jünger als 30 Jahre sind
    public static List<Person> filterPersonsYoungerThan30(List<Person> personList) {
        List<Person> youngerThan30 = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() < 30) {
                youngerThan30.add(person);
            }
        }
        return youngerThan30;
    }

}
