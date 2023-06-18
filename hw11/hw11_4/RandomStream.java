package hw11_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.iterate;

public class RandomStream {
    public static void main(String[] args) {
        Random random = new Random(25214903917L, 11, 2^48);
        Stream<Long> stream =
                iterate(0L, seed -> random.seed(seed).next());
        stream.limit(15).peek(System.out::println).collect(Collectors.toList());
    }

}
