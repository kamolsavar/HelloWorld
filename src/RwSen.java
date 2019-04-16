import java.util.Scanner;

public class RwSen {

    public static void main(String[] args) {




        String line=" I LIKE PROGRAMMING VERY MUCH";
        String []words=line.split(" ");
        int len= words.length;
        String reverseWord=" ";

        for(int i=len-1; i>=0; i--){

            String word = words[i];
            String reversedLetter="";
            for(int j=len-1; j>=0; j++){
                reversedLetter=reversedLetter+words[j];
            }

            reverseWord=reverseWord+reversedLetter;


        }

        System.out.println(reverseWord);
    }
}
