// without array List
public class dice_count {

static void dicegame(int currentValue,int end,String output){
    //Positive base case
    if(currentValue == end){
        System.out.println(output);
        return;
    }
    //negative base case
    if(currentValue > end){
        return ;
    }
    for(int dice = 1;dice<=6;dice++){
        dicegame(currentValue+ dice , end , output+ dice);
    }
}
    public static void main(String[] args, Object output) {
        dicegame(0,10,"");
    }
}
