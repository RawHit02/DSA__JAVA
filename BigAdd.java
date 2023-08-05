public class BigAdd {
    static String bigAdd(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int l1 = num1.length();
        int l2 = num2.length();
        int diffrence = l1 - l2;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = l2 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i + diffrence) - '0';
            int digit2 = num2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.insert(0, sum);

        }
        for (int j = diffrence - 1; j >= 0; j--) {
            int digit = num1.charAt(j) - '0';
            int sum = digit + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.insert(0, sum);
        }
        if (carry == 1) {
            ans.insert(0, carry);
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String num1 = "192309423043242131";
        String num2 = "2342342480";
        String ans = bigAdd(num1, num2);
        System.out.println(ans);
    }
}
