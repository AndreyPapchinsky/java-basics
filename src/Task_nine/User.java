package Task_nine;

import java.util.*;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String name = scanner.next();
        return name;
    }

    public static Integer getScore(Map<User, Integer> map, String name){
        Integer result = 0;
        for (Map.Entry<User,Integer> pair : map.entrySet()){
            User key = pair.getKey();
            Integer value = pair.getValue();

            if (key.getName().equals(name)){
                result = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Map<User, Integer> users = new HashMap<>();
        users.put(new User("One"), (int) (Math.random() * (200+1)) -100);
        users.put(new User("Two"), (int) (Math.random() * (200+1)) -100);
        users.put(new User("Three"), (int) (Math.random() * (200+1)) -100);

        System.out.println(getScore(users,getUser()));
    }
}
