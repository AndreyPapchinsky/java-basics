package Task_six.five;

import java.util.Scanner;

public class Heir extends Parent {

    @Override
    public void scan() {
        System.out.println("Имя пользователя: ");
        super.setName(scanner.nextLine());
    }
}
