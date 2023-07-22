package Trees;

import java.util.ArrayList;

public class LCA {

    static BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        ArrayList<BinaryTree<Integer>> path_1 = new ArrayList<>();
        ArrayList<BinaryTree<Integer>> path_2 = new ArrayList<>();

        if (!findPath(root, path_1, n1) || !findPath(root, path_2, n2)) {
            return null;
        }

        int i;
        for (i = 0; i < path_1.size() && i < path_2.size(); i++) {
            if (!path_1.get(i).equals(path_2.get(i))) {
                break;
            }
        }

        return path_1.get(i - 1);
    }

    static boolean findPath(BinaryTree<Integer> root, ArrayList<BinaryTree<Integer>> path, int n) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (findPath(root.left, path, n) || findPath(root.right, path, n)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}
