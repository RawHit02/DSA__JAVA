package Strings;

public class HashFunction {
    static long HashValue(String str){
        long hashvalue =0;
        for(int i=0;i<str.length();i++){
            hashvalue+=str.charAt(i) *Math.pow(10,i);
        }
        return hashvalue;
    }
    public static void main(String[] args) {
        //it uses the ASCII value to find the hash value a=97 b=98 c=99
        System.out.println(HashValue("abc"));
    }
    
}
