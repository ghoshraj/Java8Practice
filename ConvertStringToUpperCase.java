package java8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("raj");
        list.add("subha");
        list.add("bibek");
        list.add("ram");
        String result = list.stream().map(String::toUpperCase).collect(Collectors.toList()).toString();
        System.out.println(result);
    }
}
