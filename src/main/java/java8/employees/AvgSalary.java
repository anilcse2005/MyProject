package java8.employees;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AvgSalary {

    public static void main(String[] args) {
        String[] strArr = {"anil","vimal","anil","vimal","rama","chandresh"};
        int[] arr = {2,4,6,5,7,8,9,0,2,3,34,4,5,6,34,35,36,4,6,4,6,4,6};
        String name ="nil is a developer";
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        collect.stream().collect(Collectors.groupingBy(x->x%4 ==0 && x%6 ==0));
    }
}
