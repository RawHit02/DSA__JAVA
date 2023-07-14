package Tries;

public class LCP {
    static class Node {
        Node[] children; // array;
        boolean isTerminal;

        Node() {
            children = new Node[26]; // arrasy of size 26
            isTerminal = false;
        }
    }

    static Node root; // starting point of the trie

    LCP() { // constructor initialize the root node by creating a new Node instance
        root = new Node();
    }

    static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {// It checks if the current character's corresponding child node
                                                  // exists in the children array of the current node. If not, it
                                                  // creates a new Node and assigns it to the corresponding index.
                current.children[index] = new Node(); // new node if null not present
            }
            current = current.children[index];// it moves to the next node and continues the process until all characters
                                              // of the word are inserted.
        }
        current.isTerminal = true;
    }

    static String LCP(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder(); // The StringBuilder class is designed to be mutable, meaning you
                                                    // can modify the contents of the string without creating new string
                                                    // objects. This can be more efficient and performant compared to
                                                    // using regular string concatenation with the + operator.
        
        // Some key features and methods of the StringBuilder class include:
            // Appending and Inserting
            // String Conversion      
            // Modifying and Deleting
            // Capacity Management

        int minLength = findMinLength(words);

        // The method iterates from 0 to minLength - 1 (the common prefix cannot be
        // longer than the shortest word). For each index i, it compares the i-th
        // character of the first word (words[0]) with the corresponding characters of
        // the other words. If any character doesn't match or if the index is out of
        // bounds for any word, it returns the current prefix. Otherwise, it appends the
        // current character to the prefix.

        for (int i = 0; i < minLength; i++) {
            char currentChar = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }

        return prefix.toString();
    }

    // The findMinLength method takes an array of strings words and returns the
    // length of the shortest word among them. It iterates through each word,
    // comparing their lengths and keeping track of the minimum length.
    static int findMinLength(String[] words) {
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            minLength = Math.min(minLength, word.length());
        }
        return minLength;
    }

    public static void main(String[] args) {
        LCP trie = new LCP();

        String[] words = {"apple", "app", "ap"};
        for (String word : words) {
            trie.insert(word);
        }

        String commonPrefix = trie.LCP(words);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }
}
