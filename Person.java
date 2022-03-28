package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;


public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age: " + this.age;
    }

}


