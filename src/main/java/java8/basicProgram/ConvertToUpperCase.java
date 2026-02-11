package java8.basicProgram;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "c++", "javascript");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
