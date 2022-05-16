package Task_two;

public class Main {
    public static void main(String[] args) {
        Calculator one = new Calculator();
        System.out.println(one.sum(-2,3));
        System.out.println(one.sum(2.1,0));
        System.out.println(one.sum( 9223372036854775807L,-9223372036854775804L));

        Calculator two = new Calculator();
        System.out.println(two.subtraction(8,4));
        System.out.println(two.subtraction(-2.5,-7.7));
        System.out.println(two.subtraction(9223372036854775807L,9223372036854775801L));

        Calculator three = new Calculator();
        System.out.println(three.multiplication(3.6,2));
        System.out.println(three.multiplication(4,2));
        System.out.println(three.multiplication(-9223372036854775807L,-1));

        Calculator four = new Calculator();
        System.out.println(four.division(3.0,4));
        System.out.println(four.division(68.4,6));
        System.out.println(four.division(9223372036854775807L,768614336404564600L));

        Cat bars = new Cat("Bars",Color.BLACK,4.1);
        System.out.println(bars);
        bars.setWeight(5);
        System.out.println(bars.getName() + ": " + bars.getWeight() );
    }
}
