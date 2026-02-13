package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaxLenghtNamd {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        Optional<String> max = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length));
        System.out.println(max.get());
    }
}
