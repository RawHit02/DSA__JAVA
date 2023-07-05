public class SumofDigit {

    static int Sumof(int n, int sum){
        //Base Case
        if(n==0){
            return sum;
        }
        //Processing Logic
         sum+= n%10;
         //Small Problem
         n=n/10;
         return Sumof(n, sum);
    }
    public static void main(String[] args) {
        System.out.println(Sumof(2321,0));
    }
}
