public class names5times {
//     static void f(int n){
//     if(n==5){
//         return;
//     }
//     System.out.println("Rohit" );
//     n++;
//     f(n);
// }

//     public static void main(String[] args){
//         f(0);
//     }
static void f(int i ,int n){
    if(i>n){
        return;
    }
    System.out.println("Rohit");
    f(i+1,n);
}
public static void main(String[] args) {
    f(0,5);
}
}
