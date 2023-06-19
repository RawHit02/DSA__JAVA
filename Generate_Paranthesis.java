import java.util.ArrayList;
import java.util.List;

public class Generate_Paranthesis {
    

    public static List<String> generate(int n){
        List<String> ans = new ArrayList<>();
        helper(ans,"", 0 , 0 , n);
        return ans;
    }
    static void helper(List<String> ans , String currentBracket, int open , int close , int max){
        
        //Base Case

        if(currentBracket.length() == max *2){
            ans.add(currentBracket);
            return ;
        }
        if(open<max){
            //we can open a bracket when open is less then n
            //if n=3 , then we can only open 3 brackets
            helper(ans, currentBracket+"(",open+1,close,max);

        }

        if(close< open){
            // closing number of brackets cannot be greater then opening brackets
            helper(ans, currentBracket+")", open , close+1 , max);
        }
    }
    public static void main(String[] args) {
        
    }
}