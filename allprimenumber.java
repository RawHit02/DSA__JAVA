public class allprimenumber {
    static void loop(int min , int max){
        int flag =0;
        if(min<=1){
            min=2;
        }
        for(int i=min ; i<=max;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1; 
                    break;
                }
            }
            if(min<=1){
                flag=1;
            }
            if(flag==0){
                System.out.println(i+ " Prime Number");
            }
            flag=0;
        }
    }


    // Using Recursion 

    public static void findrange(int s , int e){
        if(s>e){
            return;
        }
        if(isPrime(s)){
            System.out.println(s);
        }
        findrange(s+1,e);
    }
    public static boolean isPrime(int n){
        return isPrimeHelp(n,2);
    }
    public static boolean isPrimeHelp(int n , int i){
        if (n <= 2) {
            return (n == 2);
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }

        return isPrimeHelp(n, i + 1);
    }

    
    public static void main(String[] args) {
        loop(0,10);

        int s=1;
        int e= 10;
        System.out.println("Prime number between " + s + " and " + e + " is " + ":" );
        findrange(s,e);

    }
}
