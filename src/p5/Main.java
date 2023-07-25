package p5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> phones = Stream.of("iPhone 13", "Meizu Pro 6", "Samsung Galaxy S9", "Xiaomi 13");

        ArrayList<String> filteredPhones = phones.filter(s -> s.length()>10).collect(
                ()->new ArrayList<String>(),
                (list, item) ->list.add(item),
                (list1, list2)->list1.addAll(list2)
        );
        filteredPhones.forEach(System.out::println);

    }

}
