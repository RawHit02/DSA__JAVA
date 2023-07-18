package Trees;

public class Height_of_tree {
    

    int height(BinaryTree<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight , rightHeight);
    }

    public static void main(String[] args) {
        
    }
    
}
