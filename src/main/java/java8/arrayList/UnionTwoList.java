package java8.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionTwoList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,5,8,6,4,3,9,8,7);
        List<Integer> list1= Arrays.asList(1,10,5,89,6,45,9,23,89);
       Set<Integer> collect = Stream.concat(list.stream(), list1.stream()).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
