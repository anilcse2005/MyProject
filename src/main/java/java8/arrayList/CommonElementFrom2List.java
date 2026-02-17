package java8.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementFrom2List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7,8);
        List<Integer> list2 = Arrays.asList(2,4,8,9);
        List<Integer> collect = list.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);
    }
}
