package Task_six.five;

import java.util.Scanner;

public class Parent {
    private int age;
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    Scanner scanner = new Scanner(System.in);

    public void scan(){
        System.out.println("Возраст пользователя: ");
        setAge(scanner.nextInt());
    }
}
