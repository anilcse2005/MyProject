package java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllZeroAtBegning {
    public static void main(String[] args) {
        int[] arr = {4,7,0,3,0,8,0,2,9,0};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> zeroList = list.stream().filter(x -> x == 0).collect(Collectors.toList());
        List<Integer> notZero = list.stream().filter(x->x !=0).collect(Collectors.toList());
        List<Integer> collect = IntStream.concat(zeroList.stream().mapToInt(Integer::valueOf), notZero.stream().mapToInt(Integer::valueOf)).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}
