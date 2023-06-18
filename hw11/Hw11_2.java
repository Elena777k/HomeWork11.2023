package hw11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hw11_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Noah", "Liam", "William", "Mason", "James");
        List<String> namesSortedToUpperCase = SortedNames(names);
        namesSortedToUpperCase.forEach(System.out::println);

    }
    public static List<String> SortedNames (List <String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
