package recursion.recursion1;

public class Factorial {
    static int factorial (int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
