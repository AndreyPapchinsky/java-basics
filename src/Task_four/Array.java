package Task_four;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        array();
        sortArray();
        printArray();
        replace();
        uniqueNumber();
        random();
    }
    private static int[] input(){

        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int num_array[] = new int[size];
        System.out.println("Заполните массив элементами, введёнными с клавиатуры");
        for (int i = 0; i < size; i++) {
            num_array[i] = input.nextInt();
        }
        return num_array;
    }

    private static void array(){
        int[] num_array = input();
        System.out.println((num_array[0] == 3 || num_array[num_array.length-1] == 3));

        for (int i = 0; i < num_array.length; i++){
            if (num_array[i] == 1 || num_array[i] == 3){
                System.out.println(String.format("Массив содержит число: [%s]%s",i,num_array[i]));
            }
        }
    }

    private static void sortArray(){
        int[] num_array = input();

        for (int i = 0; i < num_array.length; i++){
            if(i != (num_array.length -1) && num_array[i] <= num_array[i + 1]){
            } else if (i != (num_array.length -1) && num_array[i] > num_array[i + 1]){
                System.out.println("Please, try again");
                break;
            }else System.out.println("Массив отсортирован по возрастанию: OK");
        }
    }

    private static void printArray(){
        int[] num_array = input();
        System.out.println("Result: " + Arrays.toString(num_array));
    }

    private static void replace(){

        int[] num_array = input();
        System.out.println("Array 1: " + Arrays.toString(num_array));
        int temp = num_array[0];
        num_array[0] = num_array[num_array.length -1];
        num_array[num_array.length -1] = temp;
        System.out.println("Array 2: " + Arrays.toString(num_array));

    }

    private static void uniqueNumber(){
        int[] num_array = input();
        for (int i = 0; i < num_array.length; i++ ){
            boolean flag = true;
            for (int j = 0; j < num_array.length; j++){
                if (num_array[i] == num_array[j] &&  i != j){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(String.format("Первое уникальное число в этом массиве: [%s]%s",i,num_array[i]));
                break;
            }
        }
    }

    private static void random(){

        int min = 4;
        int max = 30;
        int size = (new Random().nextInt(max - min) + min);
        int num_array[] = new int[size];

        for (int i = 0; i < num_array.length; i++) {
            num_array[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        System.out.println("Array: " + Arrays.toString(num_array));

        mergeSort(num_array);

        System.out.println("Array Sort: " + Arrays.toString(num_array));

    }

    private static void mergeSort(int[] num_array){
        int n = num_array.length;
        if(n == 1) return;

        int mid = n / 2 ;
        int [] l = new int [mid];
        int [] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = num_array[i];
        for (int i  = mid; i < n; i++)
            r[i - mid] = num_array[i];

        mergeSort(l);
        mergeSort(r);
        merge(num_array, l , r);
    }

    private static void merge(int[] num_array, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right){
            if(l[i] < r[j]){
                num_array[idx] = l [i];
               i++;
               idx++;
            }else {
                num_array[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < left; ll++)
            num_array[idx++] = l[ll];
        for (int rr = j; rr < right; rr++)
            num_array[idx++] = r[rr];
    }
}
