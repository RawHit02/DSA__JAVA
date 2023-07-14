package Tries;

public class Delete {
    
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

        static void insert(String word) {
            Node current = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a'; // here we find where to put the word.charAt(i)= first value in the
                                                  // Node How to Find that?
                                                  // let say word is "cat" we know ASCII value of a=97 and c = 99 to
                                                  // find the index
                                                  // for placing the value of c in the Node is a-c = 99-97 = 2 so c will
                                                  // be put at 2 index.
                if (current.children[index] == null) {
                    current.children[index] = new Node();
                }
                if (i == word.length() - 1) {
                    current.children[index].isTerminal = true;
                    //System.out.println(" Word is inserted :" + word);
                }
                current = current.children[index];
            }
        }

        static boolean search(String word){
            Node current = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i) - 'a';
                Node node = current.children[index]; // maintaiining the node to  check for the current children at particular index at that particular node
                if(node==null){
                    return false;
                }
                if(i==word.length()-1 && node.isTerminal == false){
                    return false;

                } 
                current = current.children[index]; // moving into the next node if not found in previous                                             
            }
            return true;
        }

        static boolean delete(String word){
            Node current = root;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i) - 'a';
                Node node = current.children[index]; // maintaiining the node to  check for the current children at particular index at that particular node
                if(node==null){
                    return false;
                }
                if(node.isTerminal){ // word found and then we delete oit
                    return false;
                }
                current = node;
            }
            current.isTerminal=false;
            return true;
        }

public static void main(String[] args) {
    
    String[] words = {"apple" , "app" , "axe" , "ball" , "bag"};
    for(String i : words){
        insert(i);
    }
    // boolean ans = search("axes");
    // System.out.println(ans);

    boolean ans = delete("axees");
    System.out.println(ans);
}
}