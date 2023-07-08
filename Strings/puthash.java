package Strings;

public class puthash {
        static String puthash(String str) {
            StringBuilder result = new StringBuilder(); // so that append is easy
            for (int i = 0; i < str.length(); i++) {
                result.append(str.charAt(i));
                if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    result.append('#');
                    i++;
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String str = "aabbcc";
            System.out.println(puthash(str));
        }
}
