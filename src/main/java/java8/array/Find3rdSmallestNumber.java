package java8.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Find3rdSmallestNumber {
    public static void main(String[] args) {
        int[] arr ={5,7,9,1,4,8,2,};
        int k =3;
        OptionalInt first = Arrays.stream(arr).sorted().skip(k - 1).findFirst();
        System.out.println(first.getAsInt());
    }
}
