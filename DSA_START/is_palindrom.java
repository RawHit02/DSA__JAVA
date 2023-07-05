public class is_palindrom {
    public static void loop(String s){
        
        int j=s.length()-1;
        boolean ispal = true;
        for(int i=0;i<j;i++){
            if(s.charAt(i)!=s.charAt(j)){
                ispal=false; 
               break;
            }
            j--;
        }
            if(ispal){
                System.out.println("Palindrom");
            }
            else{
                System.out.println("not palindrom");
            }
        }
    

    //Recursion

    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    public static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;  // Base case, the substring has been checked
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;  // Characters at the corresponding positions are not equal
        }

        return isPalindromeHelper(str, start + 1, end - 1);
    }



    
    public static void main(String[] args) {
        loop("RohrthoR");

        String str = "aba";
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
