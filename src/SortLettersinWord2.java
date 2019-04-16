import java.util.Arrays;

public class SortLettersinWord2 {

    public static void main(String[]args){

        String str= "Bangladesh";
        String myStr=str.toLowerCase();


        char []chStr=myStr.toCharArray();
        int len=chStr.length;

        for(int i=0; i<len-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (chStr[j] < chStr[j - 1]) {
                    char temp = chStr[j - 1];
                    chStr[j - 1] = chStr[j];
                    chStr[j] = temp;


                }

                myStr=String.valueOf(chStr);
                System.out.println(myStr);
            }

        }



    }
}
