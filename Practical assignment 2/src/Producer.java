package ExFinal;

public class Producer {

    Goods goods;

    public void run(){
        for (int i = 1; i<10; i++){
            try {
                goods.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Produced"+goods.amount);

        }
    }

    public void start() {

    }
}