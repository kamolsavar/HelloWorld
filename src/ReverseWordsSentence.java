public class ReverseWordsSentence {
    public static void main(String[] args) {
        {
            /* The split() method of String class splits
             * a string in several strings based on the
             * delimiter passed as an argument to it
             */
            String str = "Good Morning Navin";
            String[] words = str.split(" ");
            String reversedString = "";

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = words.length - 1; j >= 0; j--) {
                    /* The charAt() function returns the character
                     * at the given position in a string
                     */
                    reverseWord = reverseWord + words[i];
                }
                reversedString = reversedString + reverseWord + " ";
            }
            System.out.println(str);
            System.out.println(reversedString);
        }
    }
}


