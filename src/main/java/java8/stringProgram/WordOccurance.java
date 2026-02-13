package java8.stringProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurance {
    public static void main(String[] args) {
        String str = " Java is a programming language. Java is widely used.";
        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
