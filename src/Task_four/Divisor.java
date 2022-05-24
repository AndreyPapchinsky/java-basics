package Task_four;

public class Divisor {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++){
            divisor(i);
        }
    }

    private static void divisor (int div) {
        for (int i = 0; i <= 100; i++){
            if (div == 1 && i % 2 != 0 && i < 100) {
                System.out.println("Нечетные: " + i);
            } else if (div == 2 && i % 3 == 0) {
                System.out.println(i + " делится на 3");
            } else if (div == 3 && i % 5 == 0) {
                System.out.println(i + " делится на 5 ");
            } else if (div == 4 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " делится на 3 и 5 ");
            }
        }
    }
}