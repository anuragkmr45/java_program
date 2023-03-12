package RecursionBacktracking.level1;

public class SkipEleStr {

    // static void skipElementStr(String string, char target) {
    //     String resulString = new String();
    //     helper(string, target, resulString);
    // }

    // static void helper(String str, char target, String result) {
    //     if (str.isEmpty()) {
    //         System.out.println(result);
    //         return;
    //     }

    //     if (str.charAt(0) != target) {
    //         result = result + str.charAt(0);
    //         helper(str.substring(1), target, result);
    //     } else {
    //         helper(str.substring(1), target, result);
    //     }
    // }

    static String skipElementStr(String string, char target) {
        String resulString = new String();
        return helper(string, target, resulString);
    }

    static String helper(String str, char target, String result) {
        if (str.isEmpty()) {
            // System.out.println(result);
            return result;
        }

        if (str.charAt(0) != target) {
            result = result + str.charAt(0);
            return helper(str.substring(1), target, result);
        }
        return helper(str.substring(1), target, result);
    }

    public static void main(String[] args) {
        String str = "abcdefaab";
        char target = 'a';
        System.out.println( skipElementStr(str, target));
    }
}
