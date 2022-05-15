package Task_two;

public class Cat {
    public String name;
    public Color color;
    public double weight;

    public Cat() {
    }

    public Cat(String name, Color color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
