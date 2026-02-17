package java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEachElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,3};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> collect2 = Arrays.stream(arr).boxed().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect2);
        List<Integer> collect1 = collect.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
