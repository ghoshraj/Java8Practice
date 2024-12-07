package java8;

import java.util.ArrayList;
import java.util.OptionalInt;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(22);
        list.add(11);
        list.add(14);
        list.add(15);
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        if (max.isPresent())
            System.out.println(max);
    }
}
