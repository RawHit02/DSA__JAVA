public class count_digit_in_num {

    //Loop

    static void f(int n){
        int count =0;
        int x=n;
        while(x!=0){
            int rem =x%10;
            if(rem!=0){
                count++;
            }
            x=x/10;    
        } 
        System.out.println(count);
    }

    //Recursion 

    public static int recursion(int n){
        
        if(n==0){
            return 0;
        }
        int count =0;
        int rem = n%10;
        if(rem!=0){
            count+=1;
        }
        return count+recursion(n/10);
        }

    public static void main(String[] args) {
        f(43235);
        int num = 4332235;
        System.out.println(recursion(num));
    }
    
}
