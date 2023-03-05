package strings;

public class SkipElement {
    static StringBuilder SkipStr(String str, char element) {
        StringBuilder strBu = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
                continue;
            } else {
                strBu.append(element);
            }
        }

        return strBu;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(SkipStr(str, 'b'));
    }
}
