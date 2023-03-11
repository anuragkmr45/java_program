// Give all possible permutaion of a strinf
// eg str = "abc"
// ans = abc, acb, bac, bca, cab, cba

package recursion.level2;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    
    // returning ans in repeatetd string causes more space complexity
    static void allPermutationStr(String str) {
        String ansStr = new String();
        helperStr(str, ansStr);
    }

    static void helperStr(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char elemet = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            helperStr(newStr, ans + elemet);
        }
    }
    
    // getting element in the form of ArrayList 
    static List<String> allPermutationLis(String str) {
        String res = new String();

        return helperLs(str, res);
    }

    static List<String> helperLs(String orgStr, String resStr) {
        if (orgStr.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(resStr);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < orgStr.length(); i++) {
            char element = orgStr.charAt(i);
            String newStr = orgStr.substring(0, i) + orgStr.substring(i + 1);

            ans.addAll(helperLs(newStr, resStr + element));
        }
        return ans;
    }

    // count no of permutation 
    // using basic maths aranging(permutation) n length of stirng into n positions = P(n, n) = n! / (n - n)! = n!

    static int countPermutation(String str){
        return helperCountPermutation(str, 0);
    }

    static int helperCountPermutation(String str, int index) {
        if (str.length() == 0) {
            return 1;
        }

        int count = str.length();
        return count * helperCountPermutation(str.substring(index + 1), index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        // allPermutationStr(str);
        // System.out.println(allPermutationLis(str));
        System.out.println(countPermutation(str));
    }

}
