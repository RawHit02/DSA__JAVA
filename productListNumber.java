import java.util.ArrayList;
import java.util.Collections;

public class productListNumber {

    static int recursion(ArrayList<Integer> list){
        if (list.size() <= 1) {
            return list.get(0);
        }
        else{
            int firstNum = list.get(0);
            list.remove(0);
            int remainingProduct = recursion(list);
            return firstNum * remainingProduct;
        }
    }
    


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2,3,4,5,6);
        int product = recursion(list);
        System.out.println("Product of all number present in the list is: " + product);
    }
}
