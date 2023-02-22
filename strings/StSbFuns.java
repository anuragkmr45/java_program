package strings;

import java.util.Arrays;

public class StSbFuns {
    public static void main(String[] args) {
        String st = new String("ASDFGHJKL");
        StringBuilder sb = new StringBuilder("ASDFGHJKL");

        // <--- Similarities --->
        // get the char at some index
        System.out.println(st.charAt(2));
        System.out.println(sb.charAt(2));

        // length 
        System.out.println(st.length());
        System.out.println(sb.length());

        // find index of an string
        String st2 = "anurag kumar";
        String sb2 = "anurag kumar";
        System.out.println(st2.indexOf("kumar"));
        System.out.println(sb2.indexOf("kumar"));

        // last Index of an char
        System.out.println(st2.lastIndexOf("kumar"));
        System.out.println(sb2.lastIndexOf("kumar"));
        
        // remove spaces - .strip()

        // compair two strings 
        // st1.compaureTo(st2)
        // if st1 < st2 => -ve value
        // if st1 = st2 => -ve value
        // if st1 > st2 => +ve value

        // getting substring
        // st.substring(start index, end index - 1)

        // <--- Difference --->
        // convert string to array - .toCharArray()
        // .toCharArray() is not in string builder
        System.out.println(Arrays.toString(st.toCharArray()));

        // convert to lower or upper case
        // .toLowerCase() is not in string builder
        System.out.println(st.toLowerCase());

        // changing a perticular char at an string
        st.replace("A", "Q");
        sb.setCharAt(0, 'Q');

        // insert an char at any index 
        sb.insert(3, 'e');
    }
}
