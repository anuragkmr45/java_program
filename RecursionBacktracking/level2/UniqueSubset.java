// get all unique subset (no repetition of set) 
// eg "abc" has subset "aaa, aa, a"
// so we use Hashset

package RecursionBacktracking.level2;

import java.util.HashSet;

public class UniqueSubset {
    
    static void uniqueSubset(String str) {
        HashSet<String> set = new HashSet<>();
        String res = new String();

        helperUniqueSubset(str, res, set);
    }

    static void helperUniqueSubset(String orgStr, String resStr, HashSet<String> set) {
        
        if (orgStr.length() == 0) {
            if (set.contains(resStr)) {
                return;                
            } else {
                System.out.println(resStr);
                set.add(resStr);
                return;
            }
        }

        char element = orgStr.charAt(0);

        helperUniqueSubset(orgStr.substring(1), resStr + element, set);
        helperUniqueSubset(orgStr.substring(1), resStr, set);
    }

    public static void main(String[] args) {
        String str = "abc";
        uniqueSubset(str);
    }

}
