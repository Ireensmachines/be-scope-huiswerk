package nl.novi.javaprogrammeren.one;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public void ageOneYear() {
        this.age++;
    }

}
