package Task_six.five;

import java.util.Scanner;

public class Heir extends Parent {

    @Override
    public void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя пользователя: ");
        super.setName(scanner.nextLine());
    }
}
