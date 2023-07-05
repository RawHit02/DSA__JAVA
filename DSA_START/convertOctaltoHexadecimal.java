import java.io.*;
import java.util.*;

class convertOctaltoHexadecimal {
public String convert(int n) {
// Convert octal to decimal
int decimalNumber = convertOctalToDecimal(n);

    // Convert decimal to hexadecimal
    String hexadecimalNumber = convertDecimalToHexadecimal(decimalNumber);

    return hexadecimalNumber;
}

public int convertOctalToDecimal(int octalNumber) {
    if (octalNumber == 0) {
        return 0;
    } else {
        return (octalNumber % 10) + 8 * convertOctalToDecimal(octalNumber / 10);
    }
}

public String convertDecimalToHexadecimal(int decimalNumber) {
    if (decimalNumber == 0) {
        return "";
    } else {
        int remainder = decimalNumber % 16;
        return convertDecimalToHexadecimal(decimalNumber / 16) + getHexDigit(remainder);
    }
}

public String getHexDigit(int digit) {
    if (digit < 10) {
        return String.valueOf(digit);
    } else {
        switch (digit) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return "";
        }
    }
}
}
class Main{
public static void main(String[] args) throws IOException {
    System.out.println("Enter the Octal Number");
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    // Reading N
    int n = Integer.parseInt(bufferedReader.readLine().trim());

    convertOctaltoHexadecimal solution = new convertOctaltoHexadecimal();
    String result = solution.convert(n);
    System.out.println("Hexadecimal of " + n + " = " + result);
}
}