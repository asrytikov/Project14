package p3;

import java.awt.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 13", 120000),
                new Phone("Samsung Galaxy S9", 80000),
                new Phone("Xiaomi 13", 50000)
        );

        Map<String, Integer> phoneMap = phoneStream.collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phoneMap.forEach((k,v)-> System.out.println(k+" "+v));

    }

}

class Phone{
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
