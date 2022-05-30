package Task_six.two;

public class Client extends Human implements Interface {
    private String bankName;

     public Client(String name, String surname) {
         super(name, surname);
     }

     public Client(String name, String surname, String bankName) {
         super(name, surname);
         this.bankName = bankName;
     }
}
