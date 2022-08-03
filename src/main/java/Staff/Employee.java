package Staff;

public abstract class Employee {

    private String name;
    private String NINo;
    private int salary;

    public Employee(String name, String NINo, int salary) {
        this.name = name;
        this.NINo = NINo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINo() {
        return NINo;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(double amount) {
        return this.salary += amount;
    }

    public int payBonus() {
        return this.salary / 100;
    }
}
