// print all subsequence of the given string 
// give all subsets of the string 

package recursion.level2;

import java.util.ArrayList;

public class SubSeq {

    // in form of string 
    // but this take extra sapce 
    static void subSeqStr(String str) {
        String resStr = new String();
        helperSubSeqStr(str, resStr);
    }

    static void helperSubSeqStr(String str, String resStr) {
        if (str.isEmpty()) {
            System.out.println(resStr);
            return;
        }

        char element = str.charAt(0);

        // take that element
        helperSubSeqStr(str.substring(1), resStr + element);

        // not take that element
        helperSubSeqStr(str.substring(1), resStr);
    }

    // in form of arraylist
    static ArrayList<String> subSeqArrList(String str) {
        String resStr = new String();

        return helpersubSeqArrList(str, resStr);
    }

    static ArrayList<String> helpersubSeqArrList(String str, String resStr) {
        if (str.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(resStr);
            return arr;
        }

        char element = str.charAt(0);
        ArrayList<String> left = helpersubSeqArrList(str.substring(1), resStr + element);
        ArrayList<String> right = helpersubSeqArrList(str.substring(1), resStr);

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc";
        // subSeqStr(str);
        System.out.println(subSeqArrList(str));
    }
}
