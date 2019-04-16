import java.util.Arrays;

public class MaxMinValueArray2 {

    public static void main(String[] args) {
        int[] B = {25, 29, 96, 68, 99, 101, 87, 2, 41};
        Arrays.sort(B);
        int min=B[0];
        System.out.println(min);
        int max =B[B.length-1];
        System.out.println(max);
    }
}
