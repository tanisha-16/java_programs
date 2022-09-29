/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Lenovo
 */
import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        int[] trade = new int[price.length];
        stack.push(0);
        trade[0] = 1;
        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                trade[i] = i - stack.peek();
            } else {
                trade[i] = i+1;
            }
            stack.push(i);
        }
        return trade;
    }

    public static int[] ssp(int[] stocks) {
        int[] span = new int[stocks.length];

        //The stack stores last day with a stock greater than this day 
        Stack<Integer> days = new Stack<>();

        days.push(0);
        span[0] = 1;
        for (int i = 1; i < stocks.length; i++) {

            while (!days.isEmpty() && stocks[days.peek()] < stocks[i]) {
                days.pop();
            }

            if (days.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - days.peek();
            }
            days.push(i);

        }

        return span;

    }

    public static void main(String[] args) {
        int[] arr = {60, 70, 80, 100, 90, 75, 80, 120};
        int[] res=stockSpan(arr);
        //int[] res = ssp(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
