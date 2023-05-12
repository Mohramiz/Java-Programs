class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private double salary;
    private int year;
    private String insuranceId;

    public Employee(String name, double salary, int year, String insuranceId) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceId = insuranceId;
    }

    public double getSalary() {
        return salary;
    }

    public int getYear() {
        return year;
    }

    public String getInsuranceId() {
        return insuranceId;
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Employee ob = new Employee("abc", 123, 2022, "ab3");
        System.out.println(ob.getName());
        System.out.println(ob.getSalary());
        System.out.println(ob.getYear());
        System.out.println(ob.getInsuranceId());
    }
}
