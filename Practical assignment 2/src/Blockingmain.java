package queue;

import javax.swing.text.html.parser.Element;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blockingmain {
    public static void main(String[] args){
        final BlockingQueue<Element> queue = new ArrayBlockingQueue<>(3);
        Addingthread addingthread = new Addingthread(queue);
        Takingthread takingThread = new Takingthread(queue);
        new Thread(addingthread).start();
        new Thread(takingThread).start();



    }
}