package My_thread;

class Counter {
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i ++){
                increment();
                System.out.println(getName() + ": " +count);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i ++){
            new MyThread().run();
        }
    }
}

