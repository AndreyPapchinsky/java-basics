package Task_six.one;

 public class Client extends Human{
    private String bankName;

     public Client(String name, String surname) {
         super(name, surname);
     }

     @Override
     void getHumanAll() {
         System.out.println("Имя: " + getName() + " " + "Фамилия" + getSurname() );
     }

     public Client(String name, String surname, String bankName) {
         super(name, surname);
         this.bankName = bankName;
     }
 }
