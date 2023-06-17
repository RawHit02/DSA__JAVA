import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class perfectNumberusingRecursion {
public ArrayList<Integer> perfect(int n)
{
    ArrayList<Integer> perfectNumbers = new ArrayList<>();
    for (int i = 1; i <= n; i++) 
    {
        if (isPerfectNumber(i))
            perfectNumbers.add(i);
    }
    return perfectNumbers;
}
public boolean isPerfectNumber(int num) {
    if (num <= 1) {
        return false;
    }

    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    return sum == num;
}
}

class perfectNumberusingRecursion1{    
public static void main(String[] args) throws IOException {
        System.out.println("Enter the limit");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        perfectNumberusingRecursion solution = new perfectNumberusingRecursion();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}