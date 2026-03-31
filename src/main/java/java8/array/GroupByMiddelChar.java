package java8.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByMiddelChar {
    public static void main(String[] args) {
        String [] str = {"ewe","gtg","pwd","ott","ytb"};
         Stream.of(str).collect(Collectors.groupingBy(x -> x.toString().substring(1, 2))).values().forEach(System.out::println);
        Arrays.stream(str).collect(Collectors.groupingBy(x->x.toString().substring(1,2))).values().forEach(System.out::println);
    }
}
