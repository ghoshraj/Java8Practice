package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstThreeLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6};
        List<Integer>three = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(three);
    }
}
