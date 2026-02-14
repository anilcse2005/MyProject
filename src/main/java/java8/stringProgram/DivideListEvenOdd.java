package java8.stringProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideListEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers:");
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
        List<Map.Entry<Boolean, List<Integer>>> collect = map.entrySet().stream().filter(value -> value.getKey()).collect(Collectors.toList());
        System.out.println(collect);
        Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("Odd numbers:");
        java.util.Arrays.stream(arr).filter(x -> x % 2 != 0).forEach(System.out::println);
        list.stream().collect(Collectors.groupingBy(x->x%2 != 0, Collectors.toList()))
                .entrySet().stream().filter(value -> value.getKey()).forEach(System.out::println);
    }
}
