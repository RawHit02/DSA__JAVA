import java.util.ArrayList;

//  -------------------By Loop-------------------

public class SubsequenceIterative {
    static ArrayList<String> solution(String str){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(list.size() ==0){
                list.add("");

                //"" + currentChar - bcoz currentchar data type is char

                //and our list can store only string type of data
                // so after concatenation it will become string type of data

                list.add("" + currentChar);
                continue;
            }
        int n = list.size();
        for(int j=0 ; j<n;j++){
            String temp = list.get(j)+ currentChar;
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
    }
    return list;
    }
    public static void main(String[] args) {
        String str = "ravi";

        System.out.println(solution(str));
    }
}