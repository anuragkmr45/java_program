// Subtract the Product and Sum of Digits of an Integer

package Questions.Easy;

class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int a = product(n);
        int b = sum(n);
        return a - b;        
    }

    static int product(int n){
        if (n  == 0){
            return 1;
        }
        return (n % 10)*(product(n / 10));
    }

    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return (n % 10)+(sum(n / 10));
    }
}
