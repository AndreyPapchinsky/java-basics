package Task_six.three;

public class Truck extends Car{
    private int numberWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int numberWheels, int maxWeight) {
        super(w, m, c, s);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberWheels) {
        this.numberWheels = numberWheels;
        System.out.println(numberWheels);
    }
}
