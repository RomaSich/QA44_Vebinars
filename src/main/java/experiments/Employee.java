package experiments;

public class Employee extends Person {
  public String company;

    public Employee(String name, String lastName, String company) {
        super(name, lastName);
        this.company = company;
    }
    public void work()
    {
        System.out.printf("%s %s work in %s\n", getName(), getLastName(), company);
    }
    public void display()
    {
        super.display();
        System.out.printf("Work in %s \n", company);
    }
}
