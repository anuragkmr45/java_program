package recursion;

public class SumDigit {
    static int sum(int num) {
        if ( num == 0 ) {
            return 0;
        }
        return num % 10 + sum(num / 10);
    }
}
