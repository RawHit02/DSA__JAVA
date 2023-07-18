package Stack;
import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sortstack(Stack<Integer> original){
        Stack<Integer> temp = new Stack<Integer>();
        while(!original.isEmpty()){
            int current = original.pop();
            while(!temp.isEmpty() && current>temp.peek()){
                original.push(temp.pop());
            }
            temp.push(current);
    }
    return temp;
}

public static void main(String[] args) {
    Stack<Integer> original = new Stack<Integer>();
    original.push(44);
    original.push(98);
    original.push(13);
    original.push(22);
    Stack<Integer> ans = sortstack(original);

    while(!ans.isEmpty()){
        System.out.print(ans.pop() + " ");
    }
}
}
