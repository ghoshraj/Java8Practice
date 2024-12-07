package java8;

import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(22);
        list.add(11);
        list.add(14);
        list.add(15);
        long count = list.stream().mapToInt(Integer::intValue).count();
        System.out.println(count);
    }
}
