package java8.array;

import java.util.Arrays;

public class DevideIntoParts {

    public static void dividePrint(int [] arr , int parts){
        if(arr.length %parts != 0){
            System.out.println("Array cannot be equal divide ..");
        }else {
            for (int i = 0; i < parts; i++) {
                int size = arr.length / parts;
                int start = i * size;
                int end = start + size;
                int[] result = Arrays.copyOfRange(arr, start, end);
                System.out.println(Arrays.toString(result));
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={2,3,6,8,9,4,5,6};
       DevideIntoParts.dividePrint(arr,2);
    }
}
