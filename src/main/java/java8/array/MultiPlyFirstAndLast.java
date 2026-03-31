package java8.array;

import java.util.stream.IntStream;

public class MultiPlyFirstAndLast {
    public static void main(String[] args) {
        int[] arr ={2,4,5,7,8,9,2,7};

        IntStream.range(0,arr.length/2).map(x->arr[x]*arr[arr.length-x-1]).forEach(System.out::println);
    }
}
