// Given an array representing the heights of bars in a histogram, find the maximum rectangular area that can be formed within the histogram.

package stack.Question;

import java.util.Stack;

public class MaxRectangleArea {
    public static int getMaxArea(int[] histogram) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        int current = 0;

        while (current < histogram.length) {
            if (stack.isEmpty() || histogram[current] >= histogram[stack.peek()]) {
                stack.push(current);
                current++;
            } else {
                int top = stack.pop();
                int area = histogram[top] * (stack.isEmpty() ? current : current - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = histogram[top] * (stack.isEmpty() ? current : current - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

    }
}
