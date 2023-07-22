package BST;

class BST {
    int data;
    BST left;
    BST right;
    BST(int data){
        this.data = data;
    }

    
}
class BSToperations{
    //Insert
    BST root;  // By default root is null
    int insert(int data){
        root = insert(root,data);
        return data;
    }
    BST insert(BST root, int data){
        if(this.root == null){
            this.root = new BST(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left,data);

        }
        else if(data > root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    // Search in a tree
    BST search(BST root , int data){
        //Base Case
        if(root== null ||  root.data== data){
            return root;
        }
        if(root.data > data){
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    // Min element in BST - Always present in left 
    int minElement(BST root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    int maxElement(BST root){
        int maxv = root.data;
        while(root.right != null){
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;
    }

    void add(BST root, int data){
        if(data > root.data){
            if(root.right == null){
                BST node = new BST(data);
                node.data = data;
                root.right = node;
            }
            else{
                add(root.right , data);
            }
        }
        else{
            if(root.left == null){
                BST node = new BST(data);
                node.data = data;
                root.left = node;
            }
            else{
                add(root.left, data);
            }
        }

    }
    void remove(BST currentNode , BST parentNode , boolean isLeft , int data){
        // Four Conditions
        // 1> node not having left and right child 
        // 2> node not having left child only right child present
        // 3> node not having right child only left child present
        // 4> node have both left and right child present 
        if(data > currentNode.data){
            remove(currentNode.right,parentNode,false,data);
        }
        else if(data < currentNode.data){
            remove(currentNode.left, parentNode ,true , data);
        }

        //Case 1:
        if(currentNode.left == null && currentNode.right == null){
            if(isLeft){
                parentNode.left = null;
            }
            else{
                parentNode.right = null;
            }
        }
        //case 2
        if(currentNode.left == null && currentNode.right !=null){
            if(isLeft){
                parentNode.left = currentNode.right;
            }
            else{
                parentNode.right = null;
            }
        }
        //Case 3 :
        if(currentNode.left != null && currentNode.right == null){
            if(isLeft){
                parentNode.left = currentNode.left;
            }
            else{
                parentNode.right = currentNode.left;
            }

        }
        // Case 4 :                                          
        if(currentNode.left != null && currentNode.right != null){
            int max = maxElement(currentNode.left);
            System.out.print("Left Max :" + max);
            currentNode.data = max;
            remove(currentNode.left,currentNode,true,max);
        }
    }



    // Max element in BST - Always present in right

    void print(){
        inorder(root);
    }
    void inorder(BST root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }
}
