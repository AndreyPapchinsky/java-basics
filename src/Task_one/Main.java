package Task_one;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println((46 + 10) * (10 / 3.0));
        System.out.println((29) * (4) * (-15));

        int number = 10500;
        double result  = ((number / 10.0) / 10);
        System.out.println(result);

        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result2 = (a * b * c);
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String Num_One = scanner.next();
        String Num_Two = scanner.next();
        String Num_Thr = scanner.next();
        System.out.println(Num_One + "\n" + Num_Two + "\n" + Num_Thr );

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int d = scanner.nextInt();
        if (d%2==0) {
            if (d>100)System.out.println("Выход за пределы диапазона");
            else System.out.println("Вы ввели четное число");
        }
        else System.out.println("Вы ввели нечетное число");
    }
}