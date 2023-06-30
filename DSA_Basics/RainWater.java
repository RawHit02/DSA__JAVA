public class RainWater {
    


    public static void main(String[] args) {
        int pillars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = pillars.length;
        int pMax[] = new int[n]; //it get max {0,1,1,2,2,2,2,3,3,3,3,3}
        int sMax[] = new int[n]; //           {3,3,3,3,3,3,3,3,2,2,2,1}
        pMax[0] =pillars[0];
        sMax[n-1] = pillars[n-1];


    }
}
