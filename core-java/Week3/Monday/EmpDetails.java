package Week3.Monday;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printdetails() {
        System.out.println(getName());
    }

}

class Employee extends Person {
    private String uan;
    private double salary;
    private int dateOfJoin;

    Employee(String name, String uan, double salary, int dateOfJoin) {
        super(name);
        this.uan = uan;
        this.salary = salary;
        this.dateOfJoin = dateOfJoin;
    }

    public String getUan() {
        return uan;
    }

    public void setUan(String uan) {
        this.uan = uan;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(int dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    void printdetails() {
        System.out.println(getName());
        System.out.println(getDateOfJoin());
        System.out.println(getUan());
        System.out.println(getSalary());
    }

}

public class EmpDetails {
    public static void main(String[] args) {
        Person p = new Person("Kaif");
        Employee e1 = new Employee("Bhaavs", "AT1524", 20000, 2017);
        Employee e2 = new Employee("Bhaav", "18AT1524", 20005, 2018);

        Employee e3 = e1;
        Employee e4 = new Employee("Bhaavs", "AT1524", 20000, 2017);
        p.printdetails();
        e1.printdetails();
        e2.printdetails();
        System.out.println(p.equals(e1));
        System.out.println(e2.equals(e1));
        System.out.println(e4.equals(e1));
        System.out.println(e3 == e1);
        System.out.println(e3.equals(e1));
        System.out.println(e3.getName());

    }

}
