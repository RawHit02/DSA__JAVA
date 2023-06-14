import java.util.ArrayList;
public class permutation {
    static ArrayList<String> perm(String str){

        if(str.length() ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        //currentChar - a , b , c
        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> temp = perm(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s:temp){
            for(int i=0;i<=s.length();i++){
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i,currentChar);
                result.add(sb.toString());
                // result.add(s.substring(0,i)+currentChar+s.substring()
            } 
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = perm(str); 
            System.out.println(list);

    }
}