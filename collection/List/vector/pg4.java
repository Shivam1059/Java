//thread safe in vector

import java.util.Vector;

class Worker extends Thread {
    private Vector<Integer> vector;
    private int value;

    public Worker(Vector<Integer> vector, int value) {
        this.vector = vector;
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            vector.add(value + i);
            System.out.println(Thread.currentThread().getName() + " added: " + (value + i));
            try {
                Thread.sleep(50); // simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class VectorThreadSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        // Two threads sharing the same Vector
        Worker t1 = new Worker(vector, 100);
        Worker t2 = new Worker(vector, 200);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Vector: " + vector);
        System.out.println("Total elements: " + vector.size());
    }
}
