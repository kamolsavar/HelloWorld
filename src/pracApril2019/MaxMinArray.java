package pracApril2019;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arrayNum = {7, 9, 2, 35, 89, 3};
        int max = arrayNum[0];
        int min=arrayNum[0];

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] >= max) {
                max = arrayNum[i];
            }


        }
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] <= max) {
                min = arrayNum[i];
            }


        }
        System.out.println(max+" is the max value.");
        System.out.println(min+" is the max value.");
    }
}
