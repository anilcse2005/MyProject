package java8.stringProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestLength {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        Optional<String> first = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst();
        System.out.println(first.get());
    }
}
