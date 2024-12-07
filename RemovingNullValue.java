package java8;

import java.util.Arrays;
import java.util.List;

public class RemovingNullValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", null, "Python", null, "C++");
        list.stream().filter((i) -> i != null).forEach(i -> System.out.println(i));
    }
}
