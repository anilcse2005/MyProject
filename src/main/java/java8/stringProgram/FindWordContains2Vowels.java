package java8.stringProgram;

import java.util.Arrays;

public class FindWordContains2Vowels {
    public static void main(String[] args) {
        String str = "Java is a programmng language";
        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}
