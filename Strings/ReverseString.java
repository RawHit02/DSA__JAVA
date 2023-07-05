package Strings;
import java.util.Scanner;
public class ReverseString {
    static void f(String n){
        String s="";
        for(int i=n.length()-1;i>=0;i--){
            s=s+n.charAt(i);
            }
            System.out.println(s);
        }
        static String reverse(String s){
            //Terminating Condition
            if(s.length()==1){
                return String.valueOf(s.charAt(0)); 
            }
            return reverse(s.substring(1))+ s.charAt(0);
        }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String n=sc.next();
        f(n);

        String str = "SkillRisers";
        System.out.println(reverse(str));
        }

    }
