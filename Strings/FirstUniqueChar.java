package Strings;
import java.util.HashMap;
public class FirstUniqueChar {

    static int unique(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1); // putting the character in map and checking that is it already present
            // in this map if the value is new it is 1 and if it repeat it become 2 and the value is 1 is the output 
        }

        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s ="ccode";
        int ans = unique(s);
        System.out.println("At index" + ans);
    }

    
}
