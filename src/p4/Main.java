package p4;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> phones = Stream.of("iPhone 13", "Meizu Pro 6", "Samsung Galaxy S9", "Xiaomi 13");
        HashSet<String> filteredPhone = phones.filter(s -> s.length()>10).collect(Collectors.toCollection(HashSet::new));
        filteredPhone.forEach(System.out::println);

    }

}
