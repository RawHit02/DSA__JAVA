package Trees;

import java.util.Scanner;

public class ADDtwoLists{
    static Node addTwoLists(Node first, Node second){

        Node temp1 = reverseList(first);
        Node temp2 = reverseList(second);
        Node dummy = new Node(-1);
        Node ans = dummy;
        int carry = 0;

        while(temp1 != null && temp2 != null){
            int sum =0;
            sum = temp1.data + temp2.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            temp2 = temp2.next;
            dummy = dummy.next;
        }

        while(temp1 != null){
            int sum =0;
            sum = temp1.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            dummy = dummy.next;
        }
        while(temp2 != null){
            int sum =0;
            sum = temp2.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp2= temp2.next;
            dummy = dummy.next;
        }
        if(carry > 0){
            dummy.next = new Node(carry);
            dummy = dummy.next;
        }

        return reverseList(ans.next);
    }
    public static Node reverseList(Node head){
        //your code goes here
        Node next = null;
        Node pre = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ADDtwoLists1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            ADDtwoLists g = new ADDtwoLists();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }

      private Node addTwoLists(Node first, Node second) {
        return null;
    }

    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
} {
    
}
