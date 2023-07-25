import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());*/
        ArrayList<Integer> numbers = new ArrayList<>();
        //numbers.addAll(Arrays.asList(new Integer[]{1,2,3}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        /*if (min.isPresent()) {
            System.out.println(min.get());
        }*/
        //System.out.println(min.orElse(-1));
       /* Random random = new Random();
        System.out.println(min.orElseGet(()-> random.nextInt(100)));*/

        System.out.println(min.orElseThrow(IllegalStateException::new));

    }
}