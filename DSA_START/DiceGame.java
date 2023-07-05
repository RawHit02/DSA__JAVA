import java.util.ArrayList;

public class DiceGame {
    


static ArrayList<String> game(int currentValue,int target){


    //Positive base case
    if(currentValue == target){
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        return list;

    }

    //negative base case

    if(currentValue > target){
        ArrayList<String> list = new ArrayList<>();
        return list;
    }

    ArrayList<String> result = new ArrayList<>();

    for(int dice = 1; dice<=6 ; dice++){

        int newValue = currentValue + dice;
        ArrayList<String> temp = game(newValue, target);
        for(String s: temp){
            result.add(dice+s);
        }
    }
    return result;
}
    public static void main(String[] args) {


       ArrayList<String> res = game(0, 10);
        System.out.println(res);
        System.out.println(res.size());
            }
        }