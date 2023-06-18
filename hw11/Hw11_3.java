package hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hw11_3 {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        String result = numbersToList(numbers);
        System.out.println("result = " + result);
    }
    public static String numbersToList(String[] numbers){
        List <Integer> numberToSorted= new ArrayList<>();
        for (String number : numbers) {
            String[] parts = number.split(",\\s*");
            for (String part : parts) {
                numberToSorted.add(Integer.valueOf(part.trim()));
            }
        }
        return numberToSorted.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
