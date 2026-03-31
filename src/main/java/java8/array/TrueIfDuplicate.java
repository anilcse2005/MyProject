package java8.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TrueIfDuplicate {
    public static void main(String[] args) {
        int[] arr ={4,9,8,6,4,2};

        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collection<Long> values = collect.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values();
        boolean b = values.stream().noneMatch(x -> x > 1);
        System.out.println(b);

    }
}
