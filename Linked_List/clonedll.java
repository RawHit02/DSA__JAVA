package Linked_List;

import java.util.HashMap;

class NodeDLL{
        int data;
        NodeDLL next , random;
        NodeDLL(int data){
            this.data = data;
            next = random = null;
        }
    }
public class clonedll {

    static void clone(NodeDLL head){
            HashMap<NodeDLL , NodeDLL> map = new HashMap<>();
            for(NodeDLL current = head; current != null; current = current.next){
                map.put(current, new NodeDLL(current.data));
            }
    }
    public static void main(String[] args) {
     
        
    
    }


}
