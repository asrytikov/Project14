package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 13", "Meizu Pro 6", "Samsung Galaxy S9", "Xiaomi 13");
        List<String> filteredPhones = phones.stream().filter(s -> s.length()<10).collect(Collectors.toList());
        for (String s : filteredPhones){
            System.out.println(s);
        }

    }

}
