public class MinValueArray {

    public static void main(String[] args) {


        int[] arr = {25, 29, 96, 68, 99, 101, 87, 2, 41};
        int min = arr[0];
        for (int i = 0;i<arr.length; i++ ){

            if(arr[i]<= min){
                min=arr[i];
                System.out.println("SetOut the max value:"+min);
            }
        }
        System.out.println("Max value is:"+ min);
    }
}
