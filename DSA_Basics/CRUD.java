import java.util.Scanner;
import java.util.*;

class CRUD{
    private int[] myarr;  
    private int s ; // Instance variable
    

    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s= sc.nextInt(); 
        myarr = new int[s];
        System.out.println("Enter the Elements in the array");
        for(int i=0;i<s;i++){
            myarr[i]=sc.nextInt();
        }
        System.out.println("Array Successfully created of size" + s);

    }


    public void read(){
        System.out.println("Array elements are:");
        for(int i=0 ;i<s;i++){
            System.out.print(myarr[i]+ " ");
    }
    System.out.println();
}

    public void update(int index, int item) {

        if(index >= s) {
            System.out.println("Index cannot be greater than size of the array...");
            return;
        }
        // Shift elements
        for(int i = s-1; i > index; i--) {
            myarr[i] = myarr[i-1];
        }
        myarr[index] = item;
        s++;
        System.out.println("New Updated Array is :");
        for(int i: myarr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    
    public void delete(int index) {
        if(index >= s || index < 0){
            System.out.println("Invalid index...");
            return;
        }

       for (int i = index; i < s - 1; i++) {
        myarr[i] = myarr[i + 1];
    }

        myarr[s-1]=0;
        s--;
        System.out.println("Element at index " + index + " Deleted Successfully");
        System.out.println("Remaining array elements are:");
        for (int i = 0; i < s; i++) {
            System.out.print(myarr[i] + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        CRUD obj = new CRUD();
        System.out.println("First Create an array for the Operations");
        obj.create();
        
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(" 1.READ " + " 2.UPDATE " + " 3.DELETE " + " 4.EXIT");
            System.out.println("Choose an Option :");

           int option = sc.nextInt();

            switch(option){
                
                case 1:
                    obj.read();
                    break;
                
                case 2:
                    System.out.println("Enter the index Number");
                    int index = sc.nextInt();
                    System.out.println("Enter the item to update");
                    int item = sc.nextInt();
                    obj.update(index,item);
                    break;
                
                case 3:
                    System.out.println("Enter the index Number to delete");
                    int ind = sc.nextInt();
                    obj.delete(ind);
                    break;

                case 4:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;

                default:
                System.out.println("Invalid !");
                break;
            }
        }
    }
}
