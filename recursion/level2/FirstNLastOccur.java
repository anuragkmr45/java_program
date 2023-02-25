package recursion.level2;

public class FirstNLastOccur {
    static int first = -1;
    static int last = -1;
    
    static void firstNLast(String str, char element){
        int index = 0;
        helperFirstNLast(str, element, index);
    }

    static void helperFirstNLast(String str, char element, int index) {
        if (str.length() == 1) {
            return;
        }

        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        helperFirstNLast(str, element, index + 1);
    }

    
}
