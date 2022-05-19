package Task_three;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
      System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {

        Tree redwood = new Tree(1600, "Redwood");
        Tree myrtle = new Tree(1000, true,"Myrtle");
        Tree fig = new Tree();
    }
}
