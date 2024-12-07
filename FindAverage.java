package java8;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class FindAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(22);
        list.add(11);
        list.add(14);
        list.add(15);
        OptionalDouble result = list.stream().mapToInt(Integer::intValue).average();
        if (result.isPresent())
            System.out.println(result);
    }
}
