import java.util.Arrays;

public class SortLettersinWord {

    public static void main(String[]args){

        String str= "Bangladesh";
        String myStr=str.toLowerCase();

        char ch[]=myStr.toCharArray();
        Arrays.sort(ch);
        String sortedStr =new String(ch);
        System.out.println(sortedStr);


    }
}
