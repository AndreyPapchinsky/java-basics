package Task_three;

import java.time.LocalDate;
import java.util.Scanner;

public class House {
    private int num_floors;
    private int year_const;
    private String name;

    private int getNum_floors() {
        return num_floors;
    }

    private void setNum_floors(int num_floors) {
        this.num_floors = num_floors;
    }

    private int getYear_const() {
        return year_const;
    }

    private void setYear_const(int year_const) {
        this.year_const = year_const;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void output() {
        System.out.println("Наименование: " + getName() + ", Количество этажей: " + getNum_floors() + ", Год постройки: " + getYear_const());
    }

    public void input () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Наименование: ");
        setName(scanner.next());
        System.out.println("Количество этажей: ");
        setNum_floors(scanner.nextInt());
        System.out.println("Год постройки: ");
        setYear_const(scanner.nextInt());
    }

    public void since_const(){
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        System.out.println("C момента постройки: " + (Math.abs(getYear_const() - current_Year)));
    }
}
