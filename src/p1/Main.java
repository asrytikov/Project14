package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        //min.ifPresent(v-> System.out.println(v));
        min.ifPresentOrElse(
                v-> System.out.println(v),
                ()-> System.out.println("Value not found")
        );
    }

}
