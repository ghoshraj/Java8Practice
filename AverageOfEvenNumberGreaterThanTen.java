package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEvenNumberGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 15, 18, 20, 25, 22, 11, 14);
        OptionalDouble avg = numbers.stream().filter((i) -> i % 2 == 0 && i > 10).mapToDouble(Integer::doubleValue).average();
        System.out.println(avg);
    }
}
