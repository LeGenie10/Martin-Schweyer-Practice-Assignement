package queue;

import java.util.concurrent.BlockingQueue;

public class Addingthread extends Thread{

    BlockingQueue blockingQueue;

    public Addingthread(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run(){
        for (int i=0; i<=2; i++){
            String element = null;
            element = "Element " + i;
            blockingQueue.add(element);
            System.out.println("the " + element + " has been added");
        }
    }

}