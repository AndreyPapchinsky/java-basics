package Task_two;

public class Main {
    public static void main(String[] args) {
        Calculator one = new Calculator();
        System.out.println(one.Sum(-2,3));
        System.out.println(one.Sum(2.1,0));
        System.out.println(one.Sum( 9223372036854775807L,-9223372036854775804L));

        Calculator Two = new Calculator();
        System.out.println(Two.Subtraction(8,4));
        System.out.println(Two.Subtraction(-2.5,-7.7));
        System.out.println(Two.Subtraction(9223372036854775807L,9223372036854775801L));

        Calculator Three = new Calculator();
        System.out.println(Three.Multiplication(3.6,2));
        System.out.println(Three.Multiplication(4,2));
        System.out.println(Three.Multiplication(-9223372036854775807L,-1));

        Calculator Four = new Calculator();
        System.out.println(Four.Division(300,30));
        System.out.println(Four.Division(68.4,6));
        System.out.println(Four.Division(9223372036854775807L,768614336404564600L));

        Cat Bars = new Cat("Bars",Color.BLACK,4.1);
        System.out.println(Bars);
        Bars.setWeight(5);
        System.out.println(Bars.getName() + ": " + Bars.getWeight() );
    }
}
