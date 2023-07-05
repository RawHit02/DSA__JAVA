public class backtracking_OtoN {
//   static void f(int i , int n){
//     if(i<1){
//         return;
//     }
//     f(i-=1,n);
//     System.out.println(i);
// }
// public static void main(String[] args) {
//     f(5,5);
// }  

//         Backtracing from n to 1


static void f(int i , int n){
    if(i>=n){
        return;
    }
    f(i+=1,n);
    System.out.println(i);
}

public static void main(String[] args) {
    f(0, 5);
}
}
