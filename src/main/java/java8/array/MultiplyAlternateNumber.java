package java8.array;

import java.util.stream.IntStream;

public class MultiplyAlternateNumber {
    public static void main(String[] args) {
        int [] arr = {2,9,8,7,5,6,4};
        int reduce = IntStream.range(0, arr.length).filter(x -> x % 2 == 0).map(i->arr[i]).reduce(1, (x, y) -> x * y);
        System.out.println(reduce);

        IntStream.range(0,arr.length/2).map(x->arr[x]*arr[arr.length-x-1]).forEach(System.out::println);
    }
}
