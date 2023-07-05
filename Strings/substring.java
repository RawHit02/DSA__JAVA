package Strings;

import java.util.ArrayList;
import java.util.List;

public class substring {
   


    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();

        // Generate all possible substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }

    public static void main(String[] args) {
        String input = "hello";
        List<String> substrings = generateSubstrings(input);

        // Print all generated substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}

