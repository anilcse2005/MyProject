package java8.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindRangeNumbers {
    public static void main(String[] args) {
        int [] arr = {1, 5, 8, 10, 12, 15, 20};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collection<List<Integer>> values = list.stream().collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList())).values();
        System.out.println(values);
    }
}
