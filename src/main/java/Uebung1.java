import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

public class Uebung1 {
    public static void main(String[] args) {
        // Erstelle eine Liste von 65 Personen
        List<Person> personList = createPersonList();

        // Suche nach einer Person mit dem Namen "John"
        String searchName = "John";
        System.out.println(searchName);
        Person foundPerson = searchPersonWithName(personList, searchName);
        foundPerson(foundPerson);

        // Suche nach einer Person mit dem Namen "Lewis"
        String searchLast = "Lewis";
        System.out.println(searchLast);
        Person foundPerson2 = searchPersonwithLastname(personList, searchLast);
        foundPerson(foundPerson2);



        // Identifiziere doppelte Merkmale
        List<Person> duplicates = findDuplicates(personList);
        if (duplicates.isEmpty()) {
            System.out.println("Keine doppelten Merkmale gefunden.");
        } else {
            System.out.println("Doppelte Merkmale gefunden:");
            for (Person duplicate : duplicates) {
                System.out.println("Name: " + duplicate.getName() + " " + duplicate.getLastName() + ", Alter: " + duplicate.getAge());
            }
        }
    }

    private static void foundPerson(Person foundPerson) {
        if (foundPerson != null) {
            System.out.println("Gefundene Person: " + foundPerson.getName() + " " + foundPerson.getLastName() + ", Alter: " + foundPerson.getAge());
        } else {
            System.out.println("Person nicht gefunden.");
        }
    }

    // Sucht nach einer Person mit dem angegebenen Namen in der Liste
    public static Person searchPersonWithName(List<Person> personList, String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null; // Person nicht gefunden
    }

    public static Person searchPersonwithLastname(List<Person> personList, String name) {
        for (Person person : personList) {
            if (person.getLastName().equals(name)) {
                return person;
            }
        }
        return null; // Person nicht gefunden
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

    // Erstellt eine Liste von 65 Personen mit verschiedenen Namen und Alterswerten
    public static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Doe", 25));
        personList.add(new Person("Emily", "Smith", 30));
        personList.add(new Person("Oliver", "Johnson", 28));
        personList.add(new Person("Sophia", "Williams", 33));
        personList.add(new Person("Liam", "Jones", 24));
        personList.add(new Person("Ava", "Brown", 29));
        personList.add(new Person("Noah", "Davis", 32));
        personList.add(new Person("Isabella", "Miller", 27));
        personList.add(new Person("William", "Wilson", 31));
        personList.add(new Person("Mia", "Moore", 26));
        personList.add(new Person("James", "Taylor", 30));
        personList.add(new Person("Charlotte", "Anderson", 25));
        personList.add(new Person("Benjamin", "Thomas", 34));
        personList.add(new Person("Amelia", "Jackson", 23));
        personList.add(new Person("Elijah", "White", 35));
        personList.add(new Person("Harper", "Harris", 22));
        personList.add(new Person("Lucas", "Martin", 37));
        personList.add(new Person("Evelyn", "Thompson", 21));
        personList.add(new Person("Alexander", "Garcia", 36));
        personList.add(new Person("Abigail", "Martinez", 20));
        personList.add(new Person("Michael", "Robinson", 39));
        personList.add(new Person("Elizabeth", "Clark", 19));
        personList.add(new Person("Daniel", "Rodriguez", 38));
        personList.add(new Person("Sofia", "Lewis", 18));
        personList.add(new Person("Matthew", "Lee", 41));
        personList.add(new Person("Ella", "Walker", 17));
        personList.add(new Person("Joseph", "Hall", 40));
        personList.add(new Person("Victoria", "Allen", 16));
        personList.add(new Person("David", "Young", 43));
        personList.add(new Person("Avery", "Hernandez", 15));
        personList.add(new Person("Aiden", "King", 42));
        personList.add(new Person("Sofia", "Lewis", 18));
        personList.add(new Person("Grace", "Wright", 14));
        personList.add(new Person("Henry", "Lopez", 45));
        personList.add(new Person("Scarlett", "Scott", 13));
        personList.add(new Person("Jackson", "Green", 44));
        personList.add(new Person("Chloe", "Adams", 12));
        personList.add(new Person("Sebastian", "Baker", 47));
        personList.add(new Person("Zoey", "Gonzalez", 11));
        personList.add(new Person("Carter", "Nelson", 46));
        personList.add(new Person("Lily", "Carter", 10));
        personList.add(new Person("Jayden", "Mitchell", 49));
        personList.add(new Person("Madison", "Perez", 9));
        personList.add(new Person("Wyatt", "Roberts", 48));
        personList.add(new Person("Layla", "Turner", 8));
        personList.add(new Person("Owen", "Phillips", 51));
        personList.add(new Person("Riley", "Campbell", 7));
        personList.add(new Person("Gabriel", "Parker", 50));
        personList.add(new Person("Nora", "Evans", 6));
        return personList;
    }

//    Aufgabe:
//
//    Gegeben ist der oben stehende Java-Code. Führe die folgenden Aufgaben aus:
//
//    Ergänze den fehlenden Code in der Klasse Person, um den Nachnamen jeder Person abzurufen (getLastName()).
//
//    Implementiere die Methode searchPerson(List<Person> personList, String name), die eine Liste von Personen durchsucht und die Person mit dem angegebenen Namen zurückgibt. Wenn die Person nicht gefunden wird, soll null zurückgegeben werden.
//
//    Implementiere die Methode findDuplicates(List<Person> personList), die doppelte Merkmale in der Liste identifiziert. Personen gelten als Duplikate, wenn sie den gleichen Namen und das gleiche Alter haben. Die Methode soll eine neue Liste mit den gefundenen Duplikaten zurückgeben.
//
//    Führe die Methode searchPerson aus, um nach einer Person mit dem Namen "Max" in der erstellten personList zu suchen. Gib den Namen und das Alter der gefundenen Person aus, oder gib "Person nicht gefunden." aus, falls keine Person mit dem Namen "Max" existiert.
//
//    Führe die Methode findDuplicates aus, um doppelte Merkmale in der personList zu identifizieren. Gib die gefundenen Duplikate aus, indem du den Namen und das Alter jeder Person in der Konsole ausgibst. Wenn keine Duplikate gefunden wurden, gib "Keine doppelten Merkmale gefunden." aus.
//
//    Hinweis: Vergiss nicht, den Code für die Klasse Person zu ergänzen, um den Nachnamen abzurufen (getLastName()).


}

