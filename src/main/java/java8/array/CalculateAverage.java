package java8.array;

import java.util.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        double asDouble = Arrays.stream(arr).map(Integer::valueOf).average().getAsDouble();
        System.out.println(asDouble);
    }
}
