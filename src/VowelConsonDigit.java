public class VowelConsonDigit {

    public static void main(String[] args) {
        String line = "good12 morning54";
        int count = 0, vowel = 0, consonant = 0, digits = 0, spaces = 0;


        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch==' '){
                spaces++;
            }


        }

        System.out.println(vowel);
        System.out.println(consonant);
        System.out.println(digits);
        System.out.println(digits);
    }
}
