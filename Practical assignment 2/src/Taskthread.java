package sync;

public class Taskthread extends Thread{

    String CurrentThread;
    int currentID;
    Taskmanager TaskManager;

    public Taskthread(String CurrentThread, int currentID, Taskmanager TaskManager) {
        this.CurrentThread = CurrentThread;
        this.currentID = currentID;
        this.TaskManager = TaskManager;
    }

    @Override
    public void run() {
        TaskManager.performTask(CurrentThread, currentID);
    }



}