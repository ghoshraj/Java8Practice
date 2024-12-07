package java8;

import java.util.Optional;

public class ConvertIntoUpperCase {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("Hello World");
        s.ifPresent(i -> System.out.println(i.toUpperCase()));
    }
}
