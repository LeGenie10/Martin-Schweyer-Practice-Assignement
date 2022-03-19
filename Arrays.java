import java.security.SecureRandom;

public class Arrays {

    public void playWithArrays() {

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new SecureRandom().nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("\nItem at index: %d is %d", i, intArray[i]);
        }

        java.util.Arrays.stream(intArray)
                .map(val -> Math.max(val, 0))
                .mapToObj(val -> String.valueOf(val))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();

        arrays.playWithArrays();
    }
}
