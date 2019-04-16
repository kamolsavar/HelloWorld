public class ReverseWord {

    public static void main(String[]args){
        String str= "PROGRAMMING";
        String []arr=str.split("");


        for(int i =arr.length-1; i>=0; i--){
            //String reversed=str.charAt(i);
            System.out.print(arr[i]);
        }
    }
}
