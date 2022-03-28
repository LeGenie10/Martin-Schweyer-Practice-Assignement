package lv.tsi.lamda;

import java.util.*;

public class ListProcessingWithStreams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

        Optional<String> result = list.stream().findFirst();

        System.out.println(result);
    }
}
