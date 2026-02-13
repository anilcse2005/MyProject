package java8.stringProgram;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "programming";
        str.chars().distinct().forEach(c -> System.out.print((char) c));
        System.out.println("-----------------");
        str.chars().distinct().mapToObj(c-> (char) c).forEach(System.out::print);
            }
}
