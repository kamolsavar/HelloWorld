package pracApril2019;

public class reverseWord1 {
    public static void main(String[] args) {
        String str = "Morning";
        String[]arr=str.split("");

        for (int i = arr.length-1; i >=0; i--) {

            System.out.print(arr[i]);
        }
    }
}

