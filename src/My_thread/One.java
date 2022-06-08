package My_thread;

public class One {
    static class MyThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i <= 100; i++){
                System.out.println(getName() + ": " + i );
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i ++){
            new MyThread().start();
        }
    }
}
