/*
COUNT DIGITS -
Given an integer N, return the number of digits in N.

Input:N = 12345
Output:5

Input:N = 7789
Output: 4
*/

import java.util.*;

public class Q_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number - ");
        int num1 = s.nextInt();
        int num2 = num1;
        int countDigits = 0;
        while(num1 > 0) {
            countDigits = countDigits + 1;
            num1 = num1 / 10;
        }
        System.out.println("Total digits ( method-01 ) - " + countDigits);
        // Time complexity - O(logN)

        // OR
        int digits = (int) (Math.log10(num2) + 1);
        System.out.println("Total digits ( method-02 ) - " + digits);
        // Time complexity - O(1)
    }
}
