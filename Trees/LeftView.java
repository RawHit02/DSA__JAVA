package Trees;

public class LeftView {

    static int maxLevel = 0;
    void leftView(BinaryTree<Integer> root , int level){

        if(root == null){
            return;

        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel - level;
}        }
leftView(root.left, level +1);
leftView(root.right, level +1);
    }

    public static void main(String[] args) {
        
    }
    
}
