package recursion.level2;

public class SkipStr {
    static String skip(String orgStr, String remStr) {
        String resStr = new String();

        return skipHelper(orgStr, remStr, resStr);
    }

    static String skipHelper(String orgStr, String remStr, String resStr) {
        if (orgStr.isEmpty()) {
            return resStr;
        }

        if (orgStr.startsWith(remStr)) {
            resStr = resStr + orgStr.substring(remStr.length());
            return skipHelper(orgStr.substring(remStr.length()), remStr, resStr);
        }

        return skipHelper(orgStr.substring(remStr.length()), remStr, resStr);
    }

    public static void main(String[] args) {
        String orgStr = "abcedfg";
        String remStr = "ced";

        System.out.println(skip(orgStr, remStr));
    }
}
