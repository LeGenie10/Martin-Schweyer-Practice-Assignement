package ExFinal;

public class Consumer extends Thread {

    Goods goods;

    @Override
    public void run(){
        for (int i= 1 ;i<10;i++){
            goods.consume();

            System.out.println("Produced"+goods.amount);
        }
    }

}