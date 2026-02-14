package java8.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String [] str = {"listen", "eloogg", "enlist", "inlets", "google","anil"};
       List<String> list = Arrays.asList(str);
        Collection<List<String>> values1 = list.stream().collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
        System.out.println(values1);
        System.out.println("-----------------------------");
        Collection<List<String>> values = Arrays.stream(str).collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
        System.out.println(values);
    }
}
