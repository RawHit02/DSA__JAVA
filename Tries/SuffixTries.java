package Tries;

public class SuffixTries {
    
    static class Node {
        Node[] children;
        boolean isTerminal;

        public Node() {
            children = new Node[26];// array of length 26
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            isTerminal = false;
        }
    }

    static Node root = new Node();

    static void insert(String word){
        Node current = root ;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a'; //here we find where to put the word.charAt(i)= first value in the Node How to Find that?
                                            // let say word is "cat" we know ASCII value of a=97 and c = 99 to find the index
                                            // for placing the value of c in the Node is a-c = 99-97 = 2 so c will be put at 2 index.
            if(current.children[index] == null){
                current.children[index] = new Node();
            }
            if(i == word.length()-1){
                current.children[index].isTerminal = true;
                System.out.println(" Word is inserted :" + word);
            }
            current = current.children[index];
        }
    }
}
