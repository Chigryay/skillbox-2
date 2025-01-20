public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 20);
        Person alex2 = new Person("Alex", 20);
        Person misha = new Person("Misha", 10);
        Person anna = new Person("Anna", 23);

        System.out.printf("%s \n%s \n", alex, alex2);
        System.out.println("Равен ли " + alex.getName() + " c " + alex2.getName() + "? - " + alex.equals(alex2));

        System.out.printf("%s \n%s \n", misha, anna);
        System.out.println("Равен ли " + misha.getName() + " c " + anna.getName() + "? - " + misha.equals(anna));
    }
}
