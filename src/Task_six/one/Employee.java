package Task_six.one;

public class Employee extends Human{
    private String bankName;

    public Employee(String name, String surname) {
        super(name, surname);
    }


    @Override
    void getHumanAll() {
        System.out.println("Имя: " + getName() + " " + "Фамилия" + getSurname() );
    }

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
}
