// The stock span problem is a financial problem where we have a series of n daily price quotes for a stock. We need to calculate the span of stock's price for all n days. The span of the stock's price on a given day i is defined as the maximum number of consecutive days (including the current day) on which the price of the stock is less than or equal to the price on day i.

package stack.Question;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 3 };
        int[] ans = calculateSpan(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] calculateSpan(int[] prices) {
        int[] spans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }
}