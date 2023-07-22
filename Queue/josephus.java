package Queue;

import java.util.Queue;
import java.util.*;

public class josephus {

    static int josephus(int n , int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while(queue.size()>1){
            for(int i=0;i<k-1;i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();

    }
    public static void main(String[] args) {
        int n=7;
        int k=2;
        int ans = josephus(n,k);
        System.out.println(ans);
    }
}
