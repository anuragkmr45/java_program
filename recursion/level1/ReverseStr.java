package recursion.level1;

public class ReverseStr {
    public static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }

        String newStr = str.substring(1, str.length()) + str.charAt(0);

        return reverse(newStr);
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));
    }
}
