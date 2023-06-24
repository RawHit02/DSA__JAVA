import java.util.Scanner;
public class CRUD2 {
    int arr[]; //Instance variable
    int currentSize;

    CRUD2(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    void insert(int index, int item) {
        if(index > currentSize) {
            System.out.println("Index cannot be greater than current size...");
            return;
        }
        // Shift elements
        for(int i = currentSize-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = item;
        currentSize++;
    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is empty...Cannot delete elements");
            return;
        }
        for(int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize-1] = 0;
        currentSize--;
    }

    int search(int element) {
        //Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    void update(int valuetosearch , int valuetoupdate) {
        int index = search(valuetosearch);
        if(index==-1){
            return;
        }
        else{
            arr[index] = valuetoupdate;
            System.out.println("value updated...");
            print();
        }

    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String[] args) {
        CRUD2 obj = new CRUD2(5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select choices");
            System.out.println("1. Insert");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("Enter your choices");
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    obj.insert(0 , 1);
                    obj.insert(1,2);
                    obj.insert(2 , 5);
                    obj.insert(3,4);
                    obj.insert(4 , 7);
        
                    break;

                case 2:
                    obj.print();
                    break;
                case 3:
                    obj.search(26);
                    break;
                case 4:
                    obj.update(3,100);
                    break;
                case 5:
                    obj.delete(2);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }   
    }
}