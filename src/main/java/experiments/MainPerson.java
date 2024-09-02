package experiments;

public class MainPerson {
    public static void main(String[] args) {
        Person Tom = new Person("Tom", "Wais");
        Tom.display();

        Employee Sam = new Employee("Sam", "Black", "Mincrasoft");
        Sam.display();
        Sam.work();

        Person Nick = new Employee("Nick", "Bor", "Oracle");
        Nick.display();
    }
}
