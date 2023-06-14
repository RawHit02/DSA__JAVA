public class fibseries {

    static int fib(int n){
        if(n<=1){
            return n;
        }

        int first = fib(n-1);
        int second = fib(n-1);
        int result = first + second;
        return result;

    }

    public static void main(String[] args) {
       System.out.println(fib(5));
    
            
    }
}