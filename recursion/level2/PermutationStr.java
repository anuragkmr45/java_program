// Give all possible permutaion of a strinf
// eg str = "abc"
// ans = abc, acb, bac, bca, cab, cba

package recursion.level2;

public class PermutationStr {
    
    // returning ans in repeatetd string causes more space complexity
    static void allPermutation(String str) {
        String ansStr = new String();
        helper(str, ansStr);
    }
    static void helper(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char elemet = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);

            helper(newStr, ans + elemet);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        allPermutation(str);
    }

}
