package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "grape", "orange");
        Optional<String>longest = strings.stream().max((e1 ,e2) -> Integer.compare(e1.length(),e2.length()));
        if (longest.isPresent())
            System.out.println(longest);
        else
            System.out.println("not found");
    }
}
