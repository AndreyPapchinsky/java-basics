package My_thread;

public class Two {
    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(getName() + " " + getState());
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getName() + " " + myThread.getState());
        myThread.start();
        System.out.println(myThread.getName() + " " + myThread.getState());
    }
}
