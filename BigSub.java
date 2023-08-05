public class BigSub {
    static String bigSub(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int l1 = num1.length();
        int l2 = num2.length();
        int diffrence = l1 - l2;
        int borrow = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = l2 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i + diffrence) - '0';
            int digit2 = num2.charAt(i) - '0';
            if (digit1 <= digit2) {
                digit1 += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            int sub = digit1 - digit2;
            ans.insert(0, sub);

        }
        for (int j = diffrence - 1; j >= 0; j--) {
            int digit = num1.charAt(j) - '0';
            int sub = digit - borrow;
            if (sub <= 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ans.insert(0, sub);
        }
        while (ans.length() >= 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String num1 = "999999";
        String num2 = "2";
        String ans = bigSub(num1, num2);
        System.out.println(ans);
    }
}
