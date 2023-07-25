package p8;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> result = numbers.parallel().reduce((x,y)->x*y);
        System.out.println(result.get());

    }

}
