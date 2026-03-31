package java8.stringProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatChar {
    public static void main(String[] args) {
        String str ="prograpmming";
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        char c = map.entrySet().stream().filter(e -> e.getValue() == 1).map(e->e.getKey()).findFirst().get();;
        System.out.println(c);
        Map<Character, Long> map1 = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        char ch = map1.entrySet().stream().filter(value -> value.getValue() > 1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(ch);
    }
}
