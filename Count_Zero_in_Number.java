public class Count_Zero_in_Number {
    static void loop(int n){
        int count = 0;
        while(n!=0){
            int rem = n%10;
            if(rem==0){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
    }

    static int recursion(int n){
        int count =0;
        if(n==0){
            return 0;
        }
        int rem = n%10;
        
        if(rem==0){
            count+=1;
        }
        return count+recursion(n/10);
    }

    public static void main(String[] args) {
        loop(1230000321);
        System.out.println(recursion(210100000));
    }
}
