package Task_four;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        sum();
    }

    private static int[] input(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int num_a = in.nextInt();
        System.out.print("Введите второе число : ");
        int num_b = in.nextInt();
        System.out.print("Введите третье число : ");
        int num_c = in.nextInt();
        return new int[] {num_a, num_b, num_c};
    }

    private static void sum(){

        int[] vol = input();
        if (vol[0] + vol[1] == vol[2]){
            System.out.println("Результат: cумма равна третьему целому числу");
        }
        if (vol[1] > vol[0] && vol[2] > vol[1]){
            System.out.println("Результат: второе число больше первого числа, а третье число больше второго числа ");
        }
    }
}
