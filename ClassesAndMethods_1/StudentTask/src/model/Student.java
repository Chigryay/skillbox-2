package model;

public class Student {

    private String name;
    private int numberClass;

    public Student(String name, int numberClass) {
        this.name = name;
        this.numberClass = numberClass;
    }

    public String getName() {
        return name;
    }

    public int getNumberClass() {
        return numberClass;
    }

    @Override
    public String toString() {
        return "student is "
                + name
                + " from "
                + "class "
                + numberClass;
    }
}
