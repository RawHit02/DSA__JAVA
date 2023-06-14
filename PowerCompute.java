public class PowerCompute {
    static int powerUsingLoop(int n , int pow){
        int result = 1;
        for(int i=1;i<=pow;i++){
            result *= n;
        }
        return result;
    }

    static int powerUsingRec(int n , int pow){
        if(pow==0){
            return 1;
        }
        int res = powerUsingRec(n, pow-1);
        res = res*n; // 1*2 , 2*2 , 4*2 , 8*2 , 16*2  // till n times it iterate. 
        return res;
    }
    public static void main(String[] args) {
        int n=2;
        int pow = 5;
        System.out.println(powerUsingLoop(2,5));
        System.out.println(powerUsingRec(2,5));
    }
    
}
