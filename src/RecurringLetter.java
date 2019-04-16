public class RecurringLetter {


    public static void main(String[] args) {


        String line = "Good Morning";
        int count=0;
        char ch = 'o';

        for (int i = 0; i < line.length(); i++){
            if (ch==line.charAt(i)){
                count ++;
            }
        }
        System.out.println("O recurred:"+count);

    }

}
