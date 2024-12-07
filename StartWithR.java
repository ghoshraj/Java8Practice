package java8;

import java.util.ArrayList;

public class StartWithR {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("raj");
        list.add("subha");
        list.add("bibek");
        list.add("ram");
        list.stream().filter((i) -> i.startsWith("r")).forEach(i -> System.out.println(i));
    }
}
