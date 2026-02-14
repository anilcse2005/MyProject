package java8.array;

import java.util.Arrays;

public class FindIntArray {
    public static void main(String[] args) {
        String[] arr =  {"java", "455", "c12", "123"};
        Arrays.stream(arr).filter(x->x.matches("[0-9]+")).forEach(System.out::println);
    }
}

