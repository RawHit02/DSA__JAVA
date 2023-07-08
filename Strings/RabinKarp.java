package Strings;

public class RabinKarp {
    static long HashValue(String str) {
        long hashvalue = 0;
        for (int i = 0; i < str.length(); i++) {
            hashvalue += str.charAt(i) * Math.pow(10, i);
        }
        return hashvalue;
    }

    static int searchPattern(String text , String pattern){
        int n = text.length();
        int m = pattern.length();
        long patternHash = HashValue(pattern);
        for(int i=0;i<=n-m;i++){
            long textHash = HashValue(text.substring(i,i+m));
            if(patternHash == textHash && pattern.equals(text.substring(i,i+m))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // it uses the ASCII value to find the hash value a=97 b=98 c=99
        System.out.println("index : " + searchPattern("abcdabc", "cda"));
    }
    
}
