package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UppercaseWithStreams {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("a1");
        myList.add("c3");
        myList.add("a2");
        myList.add("a3");
        myList.add("b3");
        myList.add("b2");
        myList.add("c1");
        myList.add("c2");
        myList.add("b1");

        myList.stream().map(list -> list.toUpperCase(Locale.ROOT)).
                forEach(list -> System.out.print(list + ""));
    }

}