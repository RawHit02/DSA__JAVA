package Strings;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silent";

        if (areAnagrams(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }
    }
    
}
