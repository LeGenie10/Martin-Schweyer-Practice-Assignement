package priority;

public class Prioritymain {
    public static void main(String[] args) {

        Thread min = new Prioritythread(" min");
        Thread max = new Prioritythread(" max");
        Thread norm = new Prioritythread(" norm");
        Thread ave = new Prioritythread(" avrg");

        min.start();
        max.start();
        ave.start();
        norm.start();

    }



}