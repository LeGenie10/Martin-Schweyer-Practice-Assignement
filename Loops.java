public class Loops {

    public void demoForLoop() {
    for(int i = 1; i < 10 ; i++) {
        System.out.println("This is for loop: i = " + i);
    }
}

    public void demoWhileLoop() {
        int flag = 0;

        while (flag < 10) {
            System.out.println("This is while loop: " + flag);
            flag++;
        }
    }

    public void demoDoWhileLoop() {
        int flag = 10;

        do {
            System.out.println("This is while loop: " + flag);
            flag++;

        } while (flag < 10) ;
    }


    public static void main(String... args) {
        Loops loops = new Loops();

        loops.demoWhileLoop();

    }
}

