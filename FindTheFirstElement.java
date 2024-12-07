package java8;

import java.util.Arrays;
import java.util.List;

public class FindTheFirstElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "PHP");
        String first = list.stream().filter((i) -> i.startsWith("P")).findFirst().orElse("No Match");
        System.out.println(first);
    }
}
