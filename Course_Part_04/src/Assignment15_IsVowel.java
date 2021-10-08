import java.util.Arrays;

public class Assignment15_IsVowel {

    public static void main(String[] args) {

        String[] letters = {"a", "b", "e", "P", "O", "l", "K"};

        for (String letter : letters) {
            if (isVowel(letter)) {
                System.out.printf("The char %s is a vowel%n", letter);
            } else {
                System.out.printf("The char %s is a consonant%n", letter);
            }
        }

    }

    private static boolean isVowel(String let) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        return Arrays.asList(vowels).contains(let.toLowerCase());

    }

}
