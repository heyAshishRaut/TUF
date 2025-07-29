/*
FIND GCD
The Greatest Common Divisor of any two integers is the largest number that divides both integers.
Example 1:
Input:N1 = 9, N2 = 12
Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

Example 2:
Input:N1 = 20, N2 = 15
Output: 5
Explanation:Factors of 20: 1, 2, 4, 5
Factors of 15: 1, 3, 5
Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.
*/


import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number 1 -");
        int num1 = s.nextInt();

        System.out.println("Enter number 2 -");
        int num2 = s.nextInt();

        int num = Math.min(num1, num2);

        while(num > 0) {
            if(num1 % num == 0 && num2 % num == 0) {
                System.out.println("GCF - " + num);
                return;
            }
            num = num - 1;
        }
    }
}
