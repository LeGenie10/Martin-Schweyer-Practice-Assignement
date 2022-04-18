package ExFinal;

public class Producerconsumermain {
    public static void main(String[] args) {
        Consumer consumer= new Consumer();
        Producer producer = new Producer();
        producer.start();
//       consumer.start();
    }
}