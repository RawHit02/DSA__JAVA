public class factorial {
    static int f(int n){
        if(n==0){
            return 1 ;
        }
        return n*f(n-1);
        
        
    }
    public static void main(String[] args) {
        int result = f(5);
        System.out.println(result);
    }

}
