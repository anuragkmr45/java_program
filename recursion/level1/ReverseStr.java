package recursion.level1;

public class ReverseStr {
    public static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }

        char curr = str.charAt(0);
        String newStr = reverse(str.substring(1));

        return newStr + curr;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));
    }
}
