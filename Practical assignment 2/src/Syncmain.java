package sync;

public class Syncmain {

    public static void sleepThread(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Syncmain syncmain = new Syncmain();
        final Taskmanager taskmanager = new Taskmanager();
        Thread taskThread1 = new Taskthread("Thread no1", 1, taskmanager);
        Thread taskThread2 = new Taskthread("Thread no2", 2, taskmanager);
        Thread taskThread3 = new Taskthread("Thread no3", 3, taskmanager);
        Thread taskThread4 = new Taskthread("Thread no4", 4, taskmanager);
        Thread taskThread5 = new Taskthread("Thread no5", 5, taskmanager);

        taskThread1.start();
        Syncmain.sleepThread();

        taskThread2.start();
        Syncmain.sleepThread();

        taskThread3.start();
        Syncmain.sleepThread();

        taskThread4.start();
        Syncmain.sleepThread();

        taskThread5.start();
        Syncmain.sleepThread();

    }
}