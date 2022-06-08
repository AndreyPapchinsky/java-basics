package My_thread;

public class Four {
    static class MyThread extends Thread {

        private Object lock;

        public MyThread(Object object) {
            this.lock = object;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        System.out.println(getName());
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Object lock = new Object();
        new MyThread(lock).start();
        new MyThread(lock).start();
    }
}
