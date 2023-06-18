package hw11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hw11_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Noah", "Liam", "William", "Mason", "James");
        String result = NumberNames(names);
        System.out.println(result);
    }
    public static String NumberNames (List <String> names){
        return IntStream.range(0,names.size())
                .filter(i -> i%2 == 0)
                .mapToObj(i -> (i+1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
