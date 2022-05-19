package Task_three;

public class Car {
    private Color color;
    private String name;
    private double weight;

    public String printCar (){
      return ( "Цвет: " + this.color + " Название: " + this.name + " Вес: " +  this.weight );
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public static void main(String[] args) {

        Car Porsche = new Car(Color.WHITE);
        Car Ferrari = new Car(Color.RED,1100);
        System.out.println(Porsche.printCar() + "\n" + Ferrari.printCar());
        System.out.println(Porsche + "\n" + Ferrari);
        System.out.println("Название: " + Porsche.getName() + " Цвет: " + Porsche.getColor() + " Вес :" + Porsche.getWeight());
    }
}