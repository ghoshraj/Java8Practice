package java8;

import java.util.ArrayList;
import java.util.OptionalInt;

public class FindMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(22);
        list.add(11);
        list.add(14);
        list.add(15);
        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        if (min.isPresent())
            System.out.println(min);
    }
}
