import javax.sound.sampled.SourceDataLine;

public class rotatearrayClockwise {

    public static void clockwise(int [] arr){
        System.out.println("original array is :");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ; i>0 ;i--){
            arr[i] = arr[i-1];
        }
        arr[0]= temp;
    }



    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};
        clockwise(arr);
        System.out.println();
        System.out.println("Clockwise array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
