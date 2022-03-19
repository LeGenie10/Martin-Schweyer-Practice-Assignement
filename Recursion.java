public class Recursion {

    public void recursion(int num) {
        System.out.println(num);
        recursion(num);

    }

    //: f = N! = 1 * 2 * 3 * ... * N;
    public long factorialRec(int num) {
        if (num == 0) {
            return 1;
        }

        return  num * factorialRec(num - 1);
    }

    // fact 5 = 5 * 4 * 3 * 2 * 1
    public long factorialLoop(int num) {
        long fact = num;
        for (int i = num - 1; i > 0;  i--) {
            fact = fact * i;
        }

        return fact;
    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        long result = recursion.factorialRec(10);

        System.out.println("Factorial: " + result);
    }

}

