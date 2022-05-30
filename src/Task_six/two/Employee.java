package Task_six.two;

public class Employee extends Human implements Interface {
    private String bankName;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
}
