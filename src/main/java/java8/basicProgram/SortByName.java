package java8.basicProgram;

public class SortByName {
    public static void main(String[] args) {
            String[] names = {"John", "Alice", "Bob", "Charlie"};

            // Sort the array of names
            java.util.Arrays.sort(names);

            // Print the sorted names
            System.out.println("Sorted Names:");
            for (String name : names) {
                System.out.println(name);
            }
    }
}
