package java8;

import java.util.Arrays;
import java.util.List;

public class FindPrime {
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,20,30,40,50,2,3,5);
        list.stream().filter(FindPrime :: isPrime).forEach(i -> System.out.println(i));
    }
}
