import java.util.Arrays;

public class CapitalizeWords {
    static String[] capitalizeWords(String[] words) {
        if (words.length == 0) {
            return new String[0]; // Base case: empty array
        } else {
            String[] capitalizedWords = capitalizeWords(Arrays.copyOfRange(words, 1, words.length)); // Recursively
                                                                                                     // capitalize the
                                                                                                     // remaining words

            String firstWord = words[0].toUpperCase(); // Capitalize the first word

            String[] result = new String[words.length];
            result[0] = firstWord;
            System.arraycopy(capitalizedWords, 0, result, 1, capitalizedWords.length); // Combine the capitalized words
            return result;
        }
    }

    public static void main(String[] args) {
        String[] words = { "foo", "bar", "world" };
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println(Arrays.toString(capitalizedWords));
    }
}