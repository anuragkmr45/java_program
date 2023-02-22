package strings;

public class Reverse {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    
    for (int i = 0; i < sb.length() / 2; i++) {
        int start = i;
        int end = sb.length() - 1 - i;

        char front = sb.charAt(start);
        char back = sb.charAt(end);

        sb.setCharAt(start, back);
        sb.setCharAt(end, front);
    }

    System.out.println(sb);
}
}
