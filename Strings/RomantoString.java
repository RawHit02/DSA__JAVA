package Strings;
import java.util.HashMap;
public class RomantoString {


    static int romanToint(String s){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V", 5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        int sum = 0;
        int i=0;
        while(i<s.length()){
            char singlechar = s.charAt(i); // first char of the string (s)
            String currentSymbol = String.valueOf(singlechar); // currentSymbol = singlechar value in String
            int currentValue = map.get(currentSymbol); //currentvalue get  the int value of the currentsymbol string
            int nextValue = 0;
            if(i+1<s.length()){
                char nextchar = s.charAt(i); 
                String nextSymbol = String.valueOf(nextchar); 
                nextValue = map.get(nextSymbol); 
            }
            if(currentValue<nextValue){
                sum +=(nextValue - currentValue);
                i+=2;
            }
            else{
                sum += currentValue;
                i+=1;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        System.out.println(romanToint("LXVII"));
    }
}
