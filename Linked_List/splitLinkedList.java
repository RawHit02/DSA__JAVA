package Linked_List;


class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
    }
}
public class splitLinkedList {

    ListNode start;
    ListNode tail;

    void splitCircular(){
        ListNode fast = start;
        ListNode slow = start;
        while(fast.next != start && fast.next.next != start){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next == start){
            fast = fast.next;
        }
        ListNode start_1 = start;
        ListNode start_2 = null;
        
        if(start.next != start){
            start_2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = start;
        print(start_1);
        System.out.println("+++++++++++++++++");
        print(start_2);
        }

        void print(ListNode start ){
            ListNode node = start;
            while(node.next!= start){
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
    }

    void add(int data){
        if(start == null){
            tail = start = new ListNode(data);
            return;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;
    }



    public static void main(String[] args) {

        //Circular Linked List

        splitLinkedList obj = new splitLinkedList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.tail.next = obj.start;
        obj.splitCircular();

    }
    
}
