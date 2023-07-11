package uebung1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methoden {
    // Sucht nach einer uebung1.Person mit dem angegebenen Namen in der Liste
    public static Person searchPersonWithName(List<Person> personList, String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null; // uebung1.Person nicht gefunden
    }

    public static Person searchPersonwithLastname(List<Person> personList, String name) {
        for (Person person : personList) {
            if (person.getLastName().equals(name)) {
                return person;
            }
        }
        return null; // uebung1.Person nicht gefunden
    }

    // Identifiziert doppelte Merkmale (Personen mit gleichem Namen und Alter) in der Liste
    public static List<Person> findDuplicates(List<Person> personList) {
        List<Person> duplicates = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (Person person : personList) {
            String key = person.getName() + "_" + person.getAge();
            int count = countMap.getOrDefault(key, 0);
            countMap.put(key, count + 1);
        }

        for (Person person : personList) {
            String key = person.getName() + "_" + person.getAge();
            if (countMap.get(key) > 1 && !duplicates.contains(person)) {
                duplicates.add(person);
            }
        }

        return duplicates;
    }
}
