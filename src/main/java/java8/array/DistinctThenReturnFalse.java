package java8.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctThenReturnFalse {
    public static void main(String[] args) {
        int [] arr = {2,9,8,7,4,5,6,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collection<Long> values = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values();
        boolean b = values.stream().noneMatch(x -> x > 1);
        System.out.println(b);
    }
}
