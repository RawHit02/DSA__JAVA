public class Armstrong_or_Not {
    static void loop(int n){
        int sum = 0;
        int x = n;
        while(x!=0){
            int rem = x%10;
            sum = sum + rem*rem*rem;
            x=x/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{   
            System.out.println("Not Armstrong");
        }
    }

    // Recursion
    public static int recursion(int n){
        int sum =0;
        if(n==0){
            return 0;
        }
        else{
            int rem = n%10;
            sum += rem*rem*rem + recursion(n/10);
        }
        return sum;  
    }
   
    public static void main(String[] args) {
        loop(152);

        int n =153;
        if (n == recursion(n)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");

        }
    }
}
