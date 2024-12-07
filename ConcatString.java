package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "PHP");
        String result = list.stream().collect(Collectors.joining());
        System.out.println(result);
    }
}
