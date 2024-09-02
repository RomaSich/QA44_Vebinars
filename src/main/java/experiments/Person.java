package experiments;

public class Person {
    private String name;
    private String LastName;

    public Person(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void display()
    {
        System.out.println("Name: " + name + " " +"LastName: " + LastName);
    }
}
