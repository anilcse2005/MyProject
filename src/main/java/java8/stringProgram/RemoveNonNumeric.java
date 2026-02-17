package java8.stringProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNonNumeric {
    public static void main(String[] args) {
        String []  str = {"anil","123anil","1234","45"};
        List<String> collect = Arrays.stream(str).filter(x -> x.matches("[0-9]+")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
