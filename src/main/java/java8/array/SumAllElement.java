package java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAllElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int sum = collect.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
