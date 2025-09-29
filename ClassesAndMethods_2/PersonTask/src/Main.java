import data.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alena", 21);
        Person person2 = new Person("Alex", 21);
        Person person3 = new Person("Alex", 21);

        System.out.printf("%s\n%s\n", person3, person2);
        System.out.println(person2.equals(person3));
        System.out.println(person1.equals(person3));
    }
}
