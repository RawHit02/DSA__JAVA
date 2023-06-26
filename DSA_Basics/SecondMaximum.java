public class SecondMaximum {
    //         First Neave Approach
    // static void max(int [] arr){
    //     int max = arr[0];
    //     for(int i=0;i<arr.length-1;i++){
    //         if(max < arr[i]){
    //             max = arr[i];
    //         }
    //     }
    //     int secondmax = arr[0];
    //     for(int i=1;i<arr.length-1;i++){
    //         if(arr[i]!=max){
    //             if(arr[i]>secondmax){
    //                 secondmax = arr[i];
    //             }
    //         }
    //     }
    //     System.out.println("second maximum is " + secondmax);

    // }


    //Optimized Using one single for loop
    
    static void secondmax(int [] arr){
        int n = arr.length-1;
        int max = arr[0];
        int second_max = -1;
        for(int i=1 ;i<n ; i++){
            if(arr[i]>max){
                second_max =max;
                max = arr[i];
            }
            if(arr[i]!= max){
                if(arr[i] > second_max){
                    second_max = arr[i];
                }

            }

        }
        System.out.println("second maximum value is "+ second_max);

    }



    public static void main(String[] args) {
       int [] arr = {99,2,3,4,9,100,20,95};
       
        secondmax(arr);
    }
}
