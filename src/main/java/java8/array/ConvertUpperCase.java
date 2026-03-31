package java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
    public static void main(String[] args) {
        String [] str = {"anil","vimal","Moto","gundi","gatkania"};
        List<String> collect = Arrays.stream(str).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}
