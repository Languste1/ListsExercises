package mapsDouplicate;

public class Person {
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
    public String getFullName() {
        return  name + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
