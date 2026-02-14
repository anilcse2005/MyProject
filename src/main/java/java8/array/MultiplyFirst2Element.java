package java8.array;

import java.util.Arrays;
import java.util.List;

public class MultiplyFirst2Element {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 4, 5};
        Arrays.stream(arr).limit(2).reduce((x, y) -> x * y).ifPresent(System.out::println);
        List<Integer> list = Arrays.asList(12,3,5,6,8,9);
        Integer i = list.stream().limit(2).reduce((x, y) -> x * y).get();
        System.out.println(i);
    }
}
