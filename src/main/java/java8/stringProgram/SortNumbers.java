package java8.stringProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
