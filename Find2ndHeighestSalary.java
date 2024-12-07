package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find2ndHeighestSalary {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(5000, 7000, 10000, 8000, 7000);
        Optional<Integer>ans = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (ans.isPresent())
            System.out.println(ans);
        else
            System.out.println("No match found ");
    }
}
