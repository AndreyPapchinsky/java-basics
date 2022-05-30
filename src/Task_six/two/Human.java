package Task_six.two;

public abstract class Human implements Interface{
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public void getHumanAll() {
        System.out.println("Имя: " + getName() + " " + "Фамилия" + getSurname() );
    }
}
