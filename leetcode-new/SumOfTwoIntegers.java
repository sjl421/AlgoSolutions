/*
 * Calculate the sum of two integers a and b, but you are not allowed to use 
 * the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int x = a ^ b;
            int y = a & b;
            a = x;
            b = y << 1;
        }
        return a;
    }

}