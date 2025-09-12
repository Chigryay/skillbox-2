package data;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && person.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 31 + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\nname='" + name + '\'' +
                "\nage=" + age +
                "\nhashcode=" + hashCode() +
                "\n}";
    }
}
