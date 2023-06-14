public class ReturnStatement{
    static void func(int n){ // if we are using static we dont need to call make an object in the main function 
        //Base Case
        if(n==0){
            return;
        }
        System.out.println("Recursion Call..." + n);
        func(n-1);
    
    }
    public static void main(String[] args){
        func(9);
    }
}
