package mapsDouplicate;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNamesFinder {
    public static void main(String[] args) {
        Map<Person, Integer> namesMap = new HashMap<>();
        // Füge Namen zur ursprünglichen Map hinzu
        namesMap.put(new Person("Alice", "K.", 18), 1);
        namesMap.put(new Person("Alice", "K.", 19), 2);
        namesMap.put(new Person("Bob", "Ross", 23), 3);
        namesMap.put(new Person("Mark", "Müller", 54), 65);
        namesMap.put(new Person("René", "Martinek", 54), 4);
        namesMap.put(new Person("Mark", "Müller", 54), 678);
        //namesMap.put(new Person("René", "Martinek", 54), 123);
        namesMap.put(new Person("Sven", "Bremer", 72), 5);

        Map<String, Integer> duplicateNamesMap = new HashMap<>();

        // Suche nach doppelten Namen
        for (Map.Entry<Person, Integer> entry : namesMap.entrySet()) {
            String name = entry.getKey().getFullName();
            if (duplicateNamesMap.containsKey(name)) {
                duplicateNamesMap.put(name, duplicateNamesMap.get(name) + 1);
            } else {
                duplicateNamesMap.put(name, 1);
            }
        }

        // Ausgabe der doppelten Namen
        for (Map.Entry<String, Integer> entry : duplicateNamesMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Doppelter Name: " + entry.getKey());
            }
        }
    }
}






