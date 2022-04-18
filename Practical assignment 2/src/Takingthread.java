package queue;

import java.util.concurrent.BlockingQueue;

public class Takingthread extends Thread {

    BlockingQueue blockingQueue;

    public Takingthread(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue);
    }

}